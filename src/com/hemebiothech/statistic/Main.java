package com.hemebiothech.statistic;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.hemebiothech.statistic.interfaces.IStatisticsCounter;
import com.hemebiothech.statistic.interfaces.ISymptomReader;
import com.hemebiothech.statistic.interfaces.ISymptomWritter;
/**
 * 
 * @author donderozl
 * @since 01.09.2020
 * @version projet2.02.2020
 */
public class Main {

	public static String filepath = "symptoms.txt";

	public static void main(String[] args) throws IOException {
		/*
		 *  the objects was created sr, sc, sw...
		 * */
		ISymptomReader sr = new ReadSymptomDataFromFile(filepath);
		List<String> result = sr.getSymptoms();

		IStatisticsCounter sc = new StatisticsCounter();

		Map<String, Integer> wordListe = sc.count(result);
		System.out.println(result.size());

		ISymptomWritter sw = new SymptomWritter("symptomsout.txt");

		sw.writeSymptoms(wordListe);

		for (String key : wordListe.keySet())
			System.out.println(key + " = " + wordListe.get(key));

	}

}
