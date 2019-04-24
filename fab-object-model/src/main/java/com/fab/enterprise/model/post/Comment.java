package com.fab.enterprise.model.post;


public class Comment extends BaseResponse{
	private static final long serialVersionUID = 6345016330706824202L;
	private String comment;
	private String userName;
	private String commentId;
	private String postId;
	private String commPicture;
	private String fullName;
	private String imageId;
	private boolean imageComment;
	private String parentId;
	private String profilePublicId;
	private String postUserId;
	
	
	public String getPostUserId() {
		return postUserId;
	}
	public void setPostUserId(String postUserId) {
		this.postUserId = postUserId;
	}
	public String getCommPicture() {
		return commPicture;
	}
	public void setCommPicture(String commPicture) {
		this.commPicture = commPicture;
	}
	public boolean isImageComment() {
		return imageComment;
	}
	public void setImageComment(boolean imageComment) {
		this.imageComment = imageComment;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getProfilePublicId() {
		return profilePublicId;
	}
	public void setProfilePublicId(String profilePublicId) {
		this.profilePublicId = profilePublicId;
	}
	
}
