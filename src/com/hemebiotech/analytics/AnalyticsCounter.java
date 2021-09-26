package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class AnalyticsCounter {
	
	public ISymptomReader iSymptomReader;
	
	public AnalyticsCounter() {
		iSymptomReader= new ReadSymptomDataFromFile("symptoms.txt");
	}

	public static void main(String args[]) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		//ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");		
		try {
			Map<String, Integer> map = analyticsCounter.iSymptomReader.getSymptoms();
			FileWriter writer = new FileWriter ("result.out");
			System.out.println("------------Heme Biotech----------------");
			 
			 for (Map.Entry<String, Integer> mapentry : map.entrySet()) {
				 	writer.write("Symptom : "+mapentry.getKey()+ "--> Number : " + mapentry.getValue()+"\n");
				 	System.out.println("Symptom : "+mapentry.getKey()+ " --> number : " + mapentry.getValue()+"\n");
		        }
			writer.close();
			System.out.println("Successfully wrote to the file.");
		}catch (IOException e) 
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		
	}
}
