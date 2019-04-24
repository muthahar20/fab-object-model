/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fab.enterprise.model;

import java.io.Serializable;


public class LoginResponse implements Serializable {

	private static final long serialVersionUID = -3639995733412699485L;
	private String userName;
	private String role;
	private String token;
	private String firstName;
	private String lastName;
	private String profilePublicId;

	private String coverPublicId;

	private String xAxis;

	private String yAxis;

	private String fullName;

	public String getxAxis() {
		return xAxis;
	}

	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}

	public String getyAxis() {
		return yAxis;
	}

	public void setyAxis(String yAxis) {
		this.yAxis = yAxis;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getProfilePublicId() {
		return profilePublicId;
	}

	public void setProfilePublicId(String profilePublicId) {
		this.profilePublicId = profilePublicId;
	}

	public String getCoverPublicId() {
		return coverPublicId;
	}

	public void setCoverPublicId(String coverPublicId) {
		this.coverPublicId = coverPublicId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
