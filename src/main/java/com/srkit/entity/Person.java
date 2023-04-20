package com.srkit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_person")
public class Person 
{
	@Id
	private Integer personId;
	
	private String personName;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passportId", unique = true, nullable = false)
	private Passport passport;


	public Integer getPersnId() {
		return personId;
	}


	public void setPersnId(Integer persnId) {
		this.personId = persnId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
}
