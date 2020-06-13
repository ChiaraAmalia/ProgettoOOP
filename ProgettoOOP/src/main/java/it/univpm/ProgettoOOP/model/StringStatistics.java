package it.univpm.ProgettoOOP.model;

import java.util.Map;

public class StringStatistics extends Stats{
	
	int uniqElem;
	Map<String,Long> occurrences;
	
	public StringStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uniqElem
	 * @param occurrences
	 */
	public StringStatistics(String field, int count, int uniqElem, Map<String, Long> occurrences) {
		super(field, count);
		this.uniqElem = uniqElem;
		this.occurrences = occurrences;
	}

	/**
	 * @return the uniqElem
	 */
	public int getUniqElem() {
		return uniqElem;
	}

	/**
	 * @param uniqElem the uniqElem to set
	 */
	public void setUniqElem(int uniqElem) {
		this.uniqElem = uniqElem;
	}

	/**
	 * @return the occurrences
	 */
	public Map<String, Long> getOccurrences() {
		return occurrences;
	}

	/**
	 * @param occurrences the occurrences to set
	 */
	public void setOccurrences(Map<String, Long> occurrences) {
		this.occurrences = occurrences;
	}
}
