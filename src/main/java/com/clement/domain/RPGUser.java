package com.clement.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RPG_USER")
public class RPGUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int uId;
	
	private String uFirstName;
	
	private String uLastName;
	
	private String uUserName;
	
	private String uPassword;
	
	private String uEmail;
	
	private int ocId;

	public RPGUser() {
		super();
	}

	
	
	public RPGUser(int uId) {
		super();
		this.uId = uId;
	}



	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuFirstName() {
		return uFirstName;
	}

	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}

	public String getuLastName() {
		return uLastName;
	}

	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}

	public String getuUserName() {
		return uUserName;
	}

	public void setuUserName(String uUserName) {
		this.uUserName = uUserName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public int getOcId() {
		return ocId;
	}

	public void setOcId(int ocId) {
		this.ocId = ocId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
