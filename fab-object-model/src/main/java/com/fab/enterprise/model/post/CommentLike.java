package com.fab.enterprise.model.post;

import com.fab.enterprise.model.user.BaseBean;

public class CommentLike extends BaseBean {

	private static final long serialVersionUID = 7375600027944435366L;
	
	private String commentId;

	private String userName;
    
    private String postId;
    
	
    
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	
	
}
