package com.fab.enterprise.model;

import java.util.List;

import com.fab.enterprise.model.post.PostResponse;
import com.fab.enterprise.model.timeline.TimeLineFriends;
import com.fab.enterprise.model.timeline.TimeLinePhotos;
import com.fab.enterprise.model.user.BaseBean;


public class TimeLine extends BaseBean{

	private static final long serialVersionUID = -3869269866521230222L;

	private List<TimeLinePhotos> photos;
	private TimeLineFriends friends;
	private List<PostResponse> posts;
	private String cover;
	private String profile;
	private String firstName;
	private String lastName;
	private boolean isFriend;
	private List<String> postIdList;
	private long recentDate;

	

	public TimeLineFriends getFriends() {
		return friends;
	}
	public void setFriends(TimeLineFriends friends) {
		this.friends = friends;
	}
	
	public List<TimeLinePhotos> getPhotos() {
		return photos;
	}
	public void setPhotos(List<TimeLinePhotos> photos) {
		this.photos = photos;
	}
	public List<PostResponse> getPosts() {
		return posts;
	}
	public void setPosts(List<PostResponse> posts) {
		this.posts = posts;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
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
	public boolean isFriend() {
		return isFriend;
	}
	public void setFriend(boolean isFriend) {
		this.isFriend = isFriend;
	}
	public List<String> getPostIdList() {
		return postIdList;
	}
	public void setPostIdList(List<String> postIdList) {
		this.postIdList = postIdList;
	}
	public long getRecentDate() {
		return recentDate;
	}

	public void setRecentDate(long recentDate) {
		this.recentDate = recentDate;
	}
	
}
