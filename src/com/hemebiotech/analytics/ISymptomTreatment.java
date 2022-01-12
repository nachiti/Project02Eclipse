package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author Faical
 *	Interface de traitement d'une lsite de symptoms
 */
public interface ISymptomTreatment {

	 public Map<String, Integer> treatSymptoms(List<String> listNotTreated);
}
