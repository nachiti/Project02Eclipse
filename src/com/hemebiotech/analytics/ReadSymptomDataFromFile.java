package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	List<String> list_Symptoms = new ArrayList<String>();
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() {
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line;
				
				while ((line=reader.readLine()) != null) {
	
						if(searchSymptomsInMap(line)) {
							list_Symptoms.add(line);
							//System.out.println("Symptom----- : "+line+ " | number------ : " + list_Symptoms.get(line));

					
						}else {
							list_Symptoms.add(line);
						}
					}
				

				reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}else {
			System.out.println("The file does not exist.");
		}
		
		return list_Symptoms;
	}
	
	private boolean searchSymptomsInMap(String line) {
		return list_Symptoms.contains(line)?true:false;
	
	}


}
