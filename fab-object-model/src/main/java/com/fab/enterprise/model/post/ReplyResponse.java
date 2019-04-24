package com.fab.enterprise.model.post;

public class ReplyResponse extends BaseResponse{

	private static final long serialVersionUID = 5835084775168581762L;

	private String userName;
	private String comment;
	private String postId;
	private String imageId;
	private String parentId;
	private Boolean liked;
	private ReplyLikeResponse replyLikes;
	
	
	
	public Boolean getLiked() {
		return liked;
	}
	public void setLiked(Boolean liked) {
		this.liked = liked;
	}
	public ReplyLikeResponse getReplyLikes() {
		return replyLikes;
	}
	public void setReplyLikes(ReplyLikeResponse replyLikes) {
		this.replyLikes = replyLikes;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	
}
