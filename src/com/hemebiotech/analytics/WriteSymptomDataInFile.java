package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */

public class WriteSymptomDataInFile implements ISymptomWrite {

	Map<String, Integer> list_Symptoms = new HashMap<String, Integer>();
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @throws IOException 
	 */
	@Override
	public void writeSymptoms(Map<String, Integer> map) throws IOException {
		
		FileWriter writer = new FileWriter ("result.out");
		 map.entrySet().stream()
	      .forEach(e -> {
			try {
				writer.write("Symptom : "+e.getKey()+ "--> Number : " + e.getValue()+"\n");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
			writer.close();
		 
	}

}
/*
 * 1-trie les symptoms en order alphab
 * 2-ajout class write : main contient peu des lignes 
 * 3-ISymptomReader.javapush tous sur git
 * */
