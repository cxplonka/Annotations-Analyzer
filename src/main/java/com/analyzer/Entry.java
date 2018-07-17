/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analyzer;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.analyzer.swing.AnalyzerJFrame;

/**
 * @author cplonka
 * 
 * @author Christian Plonka (cplonka81@gmail.com)
 */
public class Entry {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				final AnalyzerJFrame frame = new AnalyzerJFrame();
				frame.setVisible(true);
			}
		});
	}

}
