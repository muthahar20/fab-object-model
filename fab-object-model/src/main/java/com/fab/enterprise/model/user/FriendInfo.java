package com.fab.enterprise.model.user;

import com.fab.enterprise.model.post.UserInfo;

public class FriendInfo {


	private String friendName;
	private UserInfo userInfo;
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	
}
