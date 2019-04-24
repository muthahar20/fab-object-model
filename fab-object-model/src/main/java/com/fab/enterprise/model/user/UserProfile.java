package com.fab.enterprise.model.user;

import java.util.List;

import com.fab.enterprise.model.post.UserInfo;


public class UserProfile extends BaseBean{

	private static final long serialVersionUID = 845386916294159060L;
	
	private String userName;
	
	private String profilePublicId;
	
	private String coverPublicId;
	
	private String xAxis;
	
	private String yAxis;
	
	private String fullName;
	
	private long followersCount;
	
	private long followingCount;
	
	private boolean isFriend;
	
	private boolean follow;
	
	private List<UserInfo> following;
	
	private List<UserInfo> followers;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(long followersCount) {
		this.followersCount = followersCount;
	}
	public boolean isFriend() {
		return isFriend;
	}

	public void setFriend(boolean isFriend) {
		this.isFriend = isFriend;
	}

	public boolean isFollow() {
		return follow;
	}

	public void setFollow(boolean follow) {
		this.follow = follow;
	}
	
	public List<UserInfo> getFollowers() {
		return followers;
	}

	public void setFollowers(List<UserInfo> followers) {
		this.followers = followers;
	}

	public long getFollowingCount() {
		return followingCount;
	}

	public void setFollowingCount(long followingCount) {
		this.followingCount = followingCount;
	}

	public List<UserInfo> getFollowing() {
		return following;
	}

	public void setFollowing(List<UserInfo> following) {
		this.following = following;
	}
}
