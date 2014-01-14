package com.xiao.dbtest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crime")
public class Crime {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String category;
	private String city;
	private String county;
	private String crimeGroup;
	private String crimeNumber;
	@Column(columnDefinition="text")
	private String description;
	private String location;
	private Date startDate;
	private String zipcode;
	private String state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCrimeGroup() {
		return crimeGroup;
	}
	public void setCrimeGroup(String crimeGroup) {
		this.crimeGroup = crimeGroup;
	}
	public String getCrimeNumber() {
		return crimeNumber;
	}
	public void setCrimeNumber(String crimeNumber) {
		this.crimeNumber = crimeNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString(){
		return id+": "+crimeNumber;
	}
	
}
