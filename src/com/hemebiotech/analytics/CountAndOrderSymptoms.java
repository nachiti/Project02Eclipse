package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author user
 *
 * implémentation de ISymptomTreatment qui :
 * 		- trie et 
 * 		- count dans une map(treemap) les symtpoms
 */
public class CountAndOrderSymptoms implements ISymptomTreatment{

	/**
	 * sort
	 */
	@Override
	public Map<String, Integer> treatSymptoms(List<String> listNotTreated) {
		Map<String,Integer> mapCOuntedAndSorted = new HashMap<String, Integer>();
		int cout=0;	

//	    for (String str : listNotTreated) {
//	      System.out.println(str);
//	    }
		System.out.print("cout_________________________________"+cout+"______\n");
		for (String symptom : listNotTreated) {
			if(mapCOuntedAndSorted.containsKey(symptom)) {
				
				cout = countSymptoms(symptom,listNotTreated);
				System.out.print("cout_________________________________"+cout+"__For__\n");
				mapCOuntedAndSorted.put(symptom, cout);
				//System.out.print(mapCOuntedAndSorted.put(symptom, mapCOuntedAndSorted.get(symptom)+1));
			}else {
				//System.out.println(symptom);
				mapCOuntedAndSorted.put(symptom, 1);
			}
			
		}
		
		return mapCOuntedAndSorted;
	}

	private int countSymptoms(String symptom, List<String> listNotTreated ) {
		int cout =0;
		for(String sym:listNotTreated ) {
			if(sym.equals(symptom)){
				cout++;
				System.out.println("cout____countSymptoms__"+cout);
			}
		}
		return cout;
	}

}
