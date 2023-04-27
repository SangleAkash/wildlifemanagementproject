package com.wild.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {
	@Id
	private int no;
	private String interactionWithHuman;
	private String economicInteractions;
	private String culturalInteractions;
	private String environmentaInteractions;

	public Data() {
		super();
	}

	public Data(int no, String interactionWithHuman, String economicInteractions, String culturalInteractions,
			String environmentaInteractions) {
		super();
		this.no = no;
		this.interactionWithHuman = interactionWithHuman;
		this.economicInteractions = economicInteractions;
		this.culturalInteractions = culturalInteractions;
		this.environmentaInteractions = environmentaInteractions;
	}

	public String getInteractionWithHuman() {
		return interactionWithHuman;
	}

	public void setInteractionWithHuman(String interactionWithHuman) {
		this.interactionWithHuman = interactionWithHuman;
	}

	public String getEconomicInteractions() {
		return economicInteractions;
	}

	public void setEconomicInteractions(String economicInteractions) {
		this.economicInteractions = economicInteractions;
	}

	public String getCulturalInteractions() {
		return culturalInteractions;
	}

	public void setCulturalInteractions(String culturalInteractions) {
		this.culturalInteractions = culturalInteractions;
	}

	public String getEnvironmentaInteractions() {
		return environmentaInteractions;
	}

	public void setEnvironmentaInteractions(String environmentaInteractions) {
		this.environmentaInteractions = environmentaInteractions;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Data [no=" + no + ", interactionWithHuman=" + interactionWithHuman + ", economicInteractions="
				+ economicInteractions + ", culturalInteractions=" + culturalInteractions
				+ ", environmentaInteractions=" + environmentaInteractions + "]";
	}

}
