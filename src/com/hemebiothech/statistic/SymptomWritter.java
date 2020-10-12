package com.hemebiothech.statistic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.hemebiothech.statistic.interfaces.ISymptomWritter;

/**
 * 
 * @author donderozl
 * 
 *  We can print the symptoms like printout and it can be write every symptoms for inside
 *
 */
public class SymptomWritter implements ISymptomWritter {

	String result;

	public SymptomWritter(String result) {
	}
  /**
  * @param 
  * 
  */
	public void writeSymptoms(Map<String, Integer> wordListe) {

		File file = new File("symptomsout.txt");

		FileWriter fileWriter;
		BufferedWriter bWriter = null;
		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			fileWriter = new FileWriter(file, false);
			bWriter = new BufferedWriter(fileWriter);
			for (String key : wordListe.keySet()) {
				bWriter.write(key + " = " + wordListe.get(key) + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bWriter.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
