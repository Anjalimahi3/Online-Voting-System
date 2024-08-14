package com.java.onlinevotingsystem.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultId;
	private int electinId;
	private int candidateId;
	private int totalVote;
	private int voteReceived;
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public int getElectinId() {
		return electinId;
	}
	public void setElectinId(int electinId) {
		this.electinId = electinId;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getTotalVote() {
		return totalVote;
	}
	public void setTotalVote(int totalVote) {
		this.totalVote = totalVote;
	}
	public int getVoteReceived() {
		return voteReceived;
	}
	public void setVoteReceived(int voteReceived) {
		this.voteReceived = voteReceived;
	}
	
	
	
	
}
