package com.fab.enterprise.model.post;

import java.io.Serializable;

public class BaseRequest implements Serializable{

	private static final long serialVersionUID = -965568720063583991L;
	
	private String userName;
	
	private String postId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}
	
}
