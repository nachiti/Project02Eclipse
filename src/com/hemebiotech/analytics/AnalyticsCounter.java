package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
/**
 * 
 * @author faical
 *	main du programme
 */
public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		Analyse analyse = new Analyse(	new ReadSymptomDataFromFile("symptoms.txt"), 
										new CountAndOrderSymptoms(), 
										new WriteSymptomDataInFile());
		
		List<String> listNotCOunted = analyse.getSymptoms();
		Map<String,Integer> mapCOuntedAndSorted = analyse.treatSymptoms(listNotCOunted);
		for (Map.Entry<String, Integer> mapentry : mapCOuntedAndSorted.entrySet()) {
			  System.out.println("Symptom : "+mapentry.getKey()+ " --> number : " + mapentry.getValue()+"\n");
		}
		analyse.writeSymptoms(mapCOuntedAndSorted);	
	}
}
