package com.fab.enterprise.model.post;

import java.util.List;

import com.fab.enterprise.model.user.BaseBean;


public class ImageResponse extends BaseBean{
	private static final long serialVersionUID = -6267430954138496941L;
	
	private String description;
	private String userName;
	private String publicId;
	private String imageId;
	private String postId;
	private List<CommentResponse> comments;
	private long commentCount;
	private String title;
	private LikeResponse Likes;
	private UserInfo userInfo;
	private Boolean liked;
	private long commentPageSize;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}

	public List<CommentResponse> getComments() {
		return comments;
	}
	public void setComments(List<CommentResponse> comments) {
		this.comments = comments;
	}
	public long getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LikeResponse getLikes() {
		return Likes;
	}
	public void setLikes(LikeResponse likes) {
		Likes = likes;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public Boolean getLiked() {
		return liked;
	}
	public void setLiked(Boolean liked) {
		this.liked = liked;
	}
	public long getCommentPageSize() {
		return commentPageSize;
	}
	public void setCommentPageSize(long commentPageSize) {
		this.commentPageSize = commentPageSize;
	}	
	
}
