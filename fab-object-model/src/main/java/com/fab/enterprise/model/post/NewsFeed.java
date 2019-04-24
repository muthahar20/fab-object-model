package com.fab.enterprise.model.post;

import java.util.List;

public class NewsFeed {

	
	private List<PostResponse> posts;
	private String postCount;
	private long recentDate;
	private List<String> postIdList;
	
	public List<PostResponse> getPosts() {
		return posts;
	}
	public void setPosts(List<PostResponse> posts) {
		this.posts = posts;
	}
	public String getPostCount() {
		return postCount;
	}
	public void setPostCount(String postCount) {
		this.postCount = postCount;
	}
	public long getRecentDate() {
		return recentDate;
	}
	public void setRecentDate(long recentDate) {
		this.recentDate = recentDate;
	}
	public List<String> getPostIdList() {
		return postIdList;
	}
	public void setPostIdList(List<String> postIdList) {
		this.postIdList = postIdList;
	}
	
	
	
}
