package com.xiao.dbtest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="similarity")
public class Similarity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private double confidence;
	@Column(name="match_id")
	private String matchId;
	@Column(columnDefinition="text")
	private String match_words;
	@Column(name="request_id")
	private String requestId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getConfidence() {
		return confidence;
	}
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	public String getMatch_id() {
		return matchId;
	}
	public void setMatch_id(String match_id) {
		this.matchId = match_id;
	}
	public String getMatch_words() {
		return match_words;
	}
	public void setMatch_words(String match_words) {
		this.match_words = match_words;
	}
	public String getRequest_id() {
		return requestId;
	}
	public void setRequest_id(String request_id) {
		this.requestId = request_id;
	}
	
	
}
