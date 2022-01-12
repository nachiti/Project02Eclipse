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

		for (String symptom : listNotTreated) {
			if(mapCOuntedAndSorted.containsKey(symptom)) {
				
				cout = countSymptoms(symptom,listNotTreated);
				mapCOuntedAndSorted.put(symptom, cout);
			}else {
				mapCOuntedAndSorted.put(symptom, 1);
			}
			
		}
		
		return mapCOuntedAndSorted;
	}
	/**
	 * 
	 * @param symptom
	 * @param listNotTreated
	 * @return counter of symptoms in list
	 */

	private int countSymptoms(String symptom, List<String> listNotTreated ) {
		int cout =0;
		for(String sym:listNotTreated ) {
			if(sym.equals(symptom)){
				cout++;
			}
		}
		return cout;
	}

}
