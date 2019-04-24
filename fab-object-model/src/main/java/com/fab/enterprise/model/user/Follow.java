package com.fab.enterprise.model.user;

import java.io.Serializable;
import java.util.List;

public class Follow extends BaseBean implements Serializable{

	private static final long serialVersionUID = -2264285104063399101L;
	
	private String userName;
	
	private List<String> followList;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getFollowList() {
		return followList;
	}

	public void setFollowList(List<String> followList) {
		this.followList = followList;
	}
	
}
