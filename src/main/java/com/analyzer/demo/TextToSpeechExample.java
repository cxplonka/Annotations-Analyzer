
package com.analyzer.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.texttospeech.v1beta1.AudioConfig;
import com.google.cloud.texttospeech.v1beta1.AudioEncoding;
import com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender;
import com.google.cloud.texttospeech.v1beta1.SynthesisInput;
import com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse;
import com.google.cloud.texttospeech.v1beta1.TextToSpeechClient;
import com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings;
import com.google.cloud.texttospeech.v1beta1.VoiceSelectionParams;
import com.google.protobuf.ByteString;

/**
 * Google Cloud TextToSpeech API sample application.
 */
public class TextToSpeechExample {

	public static void main(String... args) throws Exception {
		final CredentialsProvider provider = FixedCredentialsProvider
				.create(ServiceAccountCredentials.fromStream(new FileInputStream("./API Project-xxx7.json")));

		final TextToSpeechSettings settings = TextToSpeechSettings.newBuilder().setCredentialsProvider(provider)
				.build();
		// Instantiates a client
		try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create(settings)) {
			// Set the text input to be synthesized
			final SynthesisInput input = SynthesisInput.newBuilder().setText(
					"Hello, my name is XXX and i come from Dresden in Germany! So i hope everything is OK now with the Text-to-Speech Google Service.")
					.build();

			// Build the voice request, select the language code ("en-US") and the ssml
			// voice gender
			// ("neutral")
			final VoiceSelectionParams voice = VoiceSelectionParams.newBuilder().setLanguageCode("en-US")
					.setSsmlGender(SsmlVoiceGender.FEMALE).build();

			// Select the type of audio file you want returned
			final AudioConfig audioConfig = AudioConfig.newBuilder().setAudioEncoding(AudioEncoding.MP3).build();

			// Perform the text-to-speech request on the text input with the selected voice
			// parameters and
			// audio file type
			final SynthesizeSpeechResponse response = textToSpeechClient.synthesizeSpeech(input, voice, audioConfig);

			// Get the audio contents from the response
			final ByteString audioContents = response.getAudioContent();

			// Write the response to the output file.
			try (OutputStream out = new FileOutputStream("output.mp3")) {
				out.write(audioContents.toByteArray());
				System.out.println("Audio content written to file \"output.mp3\"");
			}
		}
	}
}