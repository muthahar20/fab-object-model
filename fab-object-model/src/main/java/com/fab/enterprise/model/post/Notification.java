package com.fab.enterprise.model.post;

import com.fab.enterprise.model.user.BaseBean;

public class Notification extends BaseBean{

	private static final long serialVersionUID = -1628165796524851620L;

	private String userName;
	private String description;
	private String title;
	private String flagType;
	private String imagePublicId;
	private UserInfo user;
	private String postId;
	private String imageId;
	private Boolean unRead;
	private UserInfo friendInfo;
	private String friendName;
	private UserInfo postParent;
	
	
	
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImagePublicId() {
		return imagePublicId;
	}
	public void setImagePublicId(String imagePublicId) {
		this.imagePublicId = imagePublicId;
	}
	public String getFlagType() {
		return flagType;
	}
	public void setFlagType(String flagType) {
		this.flagType = flagType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getUnRead() {
		return unRead;
	}
	public void setUnRead(Boolean unRead) {
		this.unRead = unRead;
	}
	public UserInfo getFriendInfo() {
		return friendInfo;
	}
	public void setFriendInfo(UserInfo friendInfo) {
		this.friendInfo = friendInfo;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public UserInfo getPostParent() {
		return postParent;
	}
	public void setPostParent(UserInfo postParent) {
		this.postParent = postParent;
	}
	
	
}
