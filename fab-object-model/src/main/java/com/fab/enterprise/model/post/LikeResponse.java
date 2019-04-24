package com.fab.enterprise.model.post;

import java.util.List;

import com.fab.enterprise.model.user.BaseBean;


public class LikeResponse extends BaseBean{

	private static final long serialVersionUID = -7485613305622866036L;
	
	private long likeCount;
	private List<UserInfo> likeUsers;
	private List<UserInfo> likedFriends;
	private long friendLikeCount; 
	
	public long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}
	public List<UserInfo> getLikeUsers() {
		return likeUsers;
	}
	public void setLikeUsers(List<UserInfo> likeUsers) {
		this.likeUsers = likeUsers;
	}
	public List<UserInfo> getLikedFriends() {
		return likedFriends;
	}
	public void setLikedFriends(List<UserInfo> likedFriends) {
		this.likedFriends = likedFriends;
	}
	public long getFriendLikeCount() {
		return friendLikeCount;
	}
	public void setFriendLikeCount(long friendLikeCount) {
		this.friendLikeCount = friendLikeCount;
	}

}
