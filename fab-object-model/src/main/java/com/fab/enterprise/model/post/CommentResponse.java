package com.fab.enterprise.model.post;

import java.util.List;

public class CommentResponse extends BaseResponse{
	private static final long serialVersionUID = 2795125822694816412L;
	private String userName;
	private String comment;
	private String postId;
	private String imageId;
	private String parentId;
	private long replyCount;
	private String commPicture;
	private CommentLikeResponse commentLikes;
	private List<ReplyResponse> replyResponse;
	private Boolean liked;
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
	public Boolean getLiked() {
		return liked;
	}
	public long getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(long replyCount) {
		this.replyCount = replyCount;
	}
	public List<ReplyResponse> getReplyResponse() {
		return replyResponse;
	}
	public void setReplyResponse(List<ReplyResponse> replyResponse) {
		this.replyResponse = replyResponse;
	}
	public CommentLikeResponse getCommentLikes() {
		return commentLikes;
	}
	public void setCommentLikes(CommentLikeResponse commentLikes) {
		this.commentLikes = commentLikes;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Boolean isLiked() {
		return liked;
	}
	public void setLiked(Boolean liked) {
		this.liked = liked;
	}
	
	
}
