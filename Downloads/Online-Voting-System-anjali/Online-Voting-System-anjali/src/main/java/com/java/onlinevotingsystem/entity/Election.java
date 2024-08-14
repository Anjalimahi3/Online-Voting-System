package com.java.onlinevotingsystem.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Election {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int electionId;
	private String electionName;
	private LocalDate startDate;
	private LocalDate endDate;
	private String electionStatus;
	public int getElectionId() {
		return electionId;
	}
	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}
	public String getElectionName() {
		return electionName;
	}
	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getElectionStatus() {
		return electionStatus;
	}
	public void setElectionStatus(String electionStatus) {
		this.electionStatus = electionStatus;
	}
	
	
}
