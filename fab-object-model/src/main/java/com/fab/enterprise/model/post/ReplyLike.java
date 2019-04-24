package com.fab.enterprise.model.post;

import com.fab.enterprise.model.user.BaseBean;

public class ReplyLike extends BaseBean{

	private static final long serialVersionUID = 1209012513929312037L;
	private String replyId;
	private String userName;
    private String postId;

    
	
    
    public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getReplyId() {
		return replyId;
	}
	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	
	
}
