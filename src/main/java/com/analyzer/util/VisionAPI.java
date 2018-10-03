/*
 *
 */
package com.analyzer.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.cloud.vision.v1.ImageAnnotatorSettings;
import com.google.protobuf.ByteString;

/**
 * The Class VisionAPI.
 */
public class VisionAPI {

	/**
	 * Recognize text in image.
	 *
	 * @param vision    the vision
	 * @param imageFile the image file
	 * @return the annotate image response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static AnnotateImageResponse recognizeTextInImage(File imageFile) throws IOException {
		final List<AnnotateImageRequest> requests = new ArrayList<>();

		final CredentialsProvider provider = FixedCredentialsProvider.create(
				ServiceAccountCredentials.fromStream(new FileInputStream("./mra-learn-languages-6042e2d2fa09.json")));
		final ImageAnnotatorSettings imageAnnotatorSettings = ImageAnnotatorSettings.newBuilder()
				.setCredentialsProvider(provider).build();

		final ByteString imgBytes = ByteString.readFrom(new FileInputStream(imageFile));

		final Image img = Image.newBuilder().setContent(imgBytes).build();
		final Feature feat = Feature.newBuilder().setType(Type.DOCUMENT_TEXT_DETECTION).build();
		final AnnotateImageRequest request = AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
		requests.add(request);

		try (ImageAnnotatorClient client = ImageAnnotatorClient.create(imageAnnotatorSettings)) {
			final BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
			final List<AnnotateImageResponse> responses = response.getResponsesList();

			return responses.isEmpty() ? null : responses.iterator().next();
		}
	}
}
