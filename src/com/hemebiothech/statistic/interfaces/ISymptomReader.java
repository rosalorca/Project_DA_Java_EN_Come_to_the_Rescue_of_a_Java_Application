package com.hemebiothech.statistic.interfaces;


import java.io.FileNotFoundException;
import java.util.List;

	

/*
 * Every thing that will read symptom data from a source ---> IT'S OK

 *
 */
public interface ISymptomReader {
	
	/**
	 *  the list is now read
	 *  
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */
	List<String> getSymptoms() throws java.io.FileNotFoundException;

}
