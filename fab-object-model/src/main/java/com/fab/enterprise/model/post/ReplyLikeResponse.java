package com.fab.enterprise.model.post;

import java.util.List;

public class ReplyLikeResponse {

	private List<String> likeUsers;
	private long likeCount;
	
	
	public List<String> getLikeUsers() {
		return likeUsers;
	}
	public void setLikeUsers(List<String> likeUsers) {
		this.likeUsers = likeUsers;
	}
	public long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}
	
	
}
