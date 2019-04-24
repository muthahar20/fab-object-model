package com.fab.enterprise.model.post;

import java.util.List;

import com.fab.enterprise.model.user.BaseBean;


public class CommentLikeResponse extends BaseBean{

	private static final long serialVersionUID = -1304569681800830078L;

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
