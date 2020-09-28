package com.hemebiothech.statistic.interfaces;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWritter {
	/**
	 * 
	 * @param wordListe
	 * @throws IOException
	 */
	void writeSymptoms(Map<String, Integer> wordListe) throws IOException;
	

}
