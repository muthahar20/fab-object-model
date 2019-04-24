package com.fab.enterprise.model;

import com.fab.enterprise.model.user.BaseBean;

public class FabWallBean extends BaseBean{

	private static final long serialVersionUID = -764412370266731258L;
	private long friendsCount;
	private long friendsRequest;
	private long photos;
	private long videos;
	private long circles;
	public long getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(long friendsCount) {
		this.friendsCount = friendsCount;
	}
	public long getFriendsRequest() {
		return friendsRequest;
	}
	public void setFriendsRequest(long friendsRequest) {
		this.friendsRequest = friendsRequest;
	}
	public long getPhotos() {
		return photos;
	}
	public void setPhotos(long photos) {
		this.photos = photos;
	}
	public long getVideos() {
		return videos;
	}
	public void setVideos(long videos) {
		this.videos = videos;
	}
	public long getCircles() {
		return circles;
	}
	public void setCircles(long circles) {
		this.circles = circles;
	}
	

	
	
	

	
	
	
	
	
	

	
	
}
