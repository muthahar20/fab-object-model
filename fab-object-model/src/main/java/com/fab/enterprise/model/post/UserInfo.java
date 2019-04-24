package com.fab.enterprise.model.post;

public class UserInfo {
	
	private String userName;
	private String fullName;
	private String firstName;
	private String profilePublicId;
	private String lastName;
	private Boolean isFriend;
	private Boolean follow;
	private boolean isFriendRequest;
	
	
	
	public boolean isFriendRequest() {
		return isFriendRequest;
	}
	public void setFriendRequest(boolean isFriendRequest) {
		this.isFriendRequest = isFriendRequest;
	}
	public Boolean getIsFriend() {
		return isFriend;
	}
	public void setIsFriend(Boolean isFriend) {
		this.isFriend = isFriend;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getProfilePublicId() {
		return profilePublicId;
	}
	public void setProfilePublicId(String profilePublicId) {
		this.profilePublicId = profilePublicId;
	}
	public Boolean getFollow() {
		return follow;
	}
	public void setFollow(Boolean follow) {
		this.follow = follow;
	}
	
}
