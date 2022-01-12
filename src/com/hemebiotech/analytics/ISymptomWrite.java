package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */

public interface ISymptomWrite {
	/**
	 * If no data is available, return an empty List
	 * @return 
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 * @throws IOException 
	 */
	  public void writeSymptoms(Map<String,Integer> mapTreated) throws IOException ;
}
