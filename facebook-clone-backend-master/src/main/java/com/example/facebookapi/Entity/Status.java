package com.example.facebookapi.Entity;

import org.hibernate.annotations.GeneratorType;

import java.sql.Timestamp;
import java.util.UUID;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long statusID;

	private String userID;
	private String statusImageURL;
	private Timestamp uploadTIme;

	public Status() {
		super();
	}

	public Status(Long statusID, String userID, String statusImageURL, Timestamp uploadTIme) {
		super();
		this.statusID = statusID;
		this.userID = userID;
		this.statusImageURL = statusImageURL;
		this.uploadTIme = uploadTIme;
	}

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getStatusImageURL() {
		return statusImageURL;
	}

	public void setStatusImageURL(String statusImageURL) {
		this.statusImageURL = statusImageURL;
	}

	public Timestamp getUploadTIme() {
		return uploadTIme;
	}

	public void setUploadTIme(Timestamp uploadTIme) {
		this.uploadTIme = uploadTIme;
	}


}
