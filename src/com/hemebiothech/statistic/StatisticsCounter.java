package com.hemebiothech.statistic;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiothech.statistic.interfaces.IStatisticsCounter;

public class StatisticsCounter implements IStatisticsCounter{
	
	/**
	 * 
	 * @param symptoms
	 * @return if we would add new symptom directly we can.
	 * 
	 *
	 */
	public Map<String, Integer> count(List<String> symptoms) {

		Map<String, Integer> wordListe = new TreeMap<>();

		for (String symptom : symptoms) {

			Integer count = wordListe.get(symptom);
			if (count == null) {
				wordListe.put(symptom, 1);
			} else {
				wordListe.put(symptom, count + 1);

			}
		}
		return wordListe;
	

	
	
	}
															
}