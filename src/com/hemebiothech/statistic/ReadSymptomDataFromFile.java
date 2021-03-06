package com.hemebiothech.statistic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiothech.statistic.interfaces.ISymptomReader;

/**
 * i added one condition for reading the filepath... filepath wasn't empty and
 * contain a list of lines
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;

	}

	@Override
	public List<String> getSymptoms() {

		List<String> result = new ArrayList<String>();

		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

		return result;

	}

}
