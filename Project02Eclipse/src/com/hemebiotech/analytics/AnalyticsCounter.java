package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static String filepath = "symptoms.txt";

	public static void main(String args[]) throws Exception {
		ISymptomReader extracteur = new ReadSymptomDataFromFile(filepath);
		Map<String, Integer> wordListe = new HashMap<>();
		List<String> result = new ArrayList<>();

		result = extracteur.GetSymptoms();
		for (String chiffre : result) {
			// System.out.println(chiffre);
			Integer count = wordListe.get(chiffre);
			wordListe.put(chiffre, (count == null) ? 1 : count + 1);

		}

		for (String key : wordListe.keySet())
			System.out.println(key + " = " + wordListe.get(key));
		System.out.println(result.size());

	}
}
