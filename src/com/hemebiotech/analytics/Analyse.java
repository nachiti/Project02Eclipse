package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Analyse {
	
	private ISymptomReader reader;
	private ISymptomTreatment treatment;
	private ISymptomWrite writer;
	
	//contructeur
	public Analyse (ISymptomReader readerFromMain, ISymptomTreatment treatmentFromMain, ISymptomWrite writerFromMain) {
	this.reader = readerFromMain;
	this.writer = writerFromMain;
	this.treatment = treatmentFromMain;
	}
	
	public List<String> getSymptoms() {
		return this.reader.getSymptoms();
	}
	
	public Map<String, Integer> treatSymptoms(List<String> listNotTreated) {
		return this.treatment.treatSymptoms(listNotTreated);
	}
	
	public void writeSymptoms(Map<String,Integer> mapTreated) throws IOException {
		this.writer.writeSymptoms(mapTreated);
	}
	
	


}
