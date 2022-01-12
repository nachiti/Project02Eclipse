package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		System.out.println(" -------- Debut ------------ ");
		Analyse analyse = new Analyse(	new ReadSymptomDataFromFile("symptoms.txt"), 
										new CountAndOrderSymptoms(), 
										new WriteSymptomDataInFile());
		
		List<String> listNotCOunted = analyse.getSymptoms();
		Map<String,Integer> mapCOuntedAndSorted = analyse.treatSymptoms(listNotCOunted);
		for (Map.Entry<String, Integer> mapentry : mapCOuntedAndSorted.entrySet()) {
			  //System.out.println("Symptom : "+mapentry.getKey()+ " --> number : " + mapentry.getValue()+"\n");
      }
		analyse.writeSymptoms(mapCOuntedAndSorted);
		System.out.println(" -------- Fin ------------ ");
		
		
		
		
//		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
//		//ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");		
//		try {
//			Map<String, Integer> map = analyticsCounter.iSymptomReader.getSymptoms();
//			FileWriter writer = new FileWriter ("result.out");
//			// try with java 8 : using strem
//			 map.entrySet().stream()
//		      .forEach(e -> {
//				try {
//					writer.write("Symptom : "+e.getKey()+ "--> Number : " + e.getValue()+"\n");
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
//			});
//			//end using strem
//			
//			System.out.println("------------Heme Biotech----------------");
//			 
//			if(map.isEmpty()) {
//				 System.out.println("the file is empty");
//			 }else {
//				  for (Map.Entry<String, Integer> mapentry : map.entrySet()) {
//					  writer.write("Symptom : "+mapentry.getKey()+ "--> Number : " + mapentry.getValue()+"\n");
//				 
//					  
//					  System.out.println("Symptom : "+mapentry.getKey()+ " --> number : " + mapentry.getValue()+"\n");
//		        }
//			 }
//			
//			writer.close();
//			System.out.println("Successfully wrote to the file.");
//		}catch (IOException e) 
//		{
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		}
		
		
	}
}
