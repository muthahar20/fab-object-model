package com.fab.enterprise.model.post;

import java.util.List;

import com.fab.enterprise.model.SharedResponse;
import com.fab.enterprise.model.user.BaseBean;

public class PostResponse extends BaseBean{

	private static final long serialVersionUID = 5431763683207428652L;

	private String userName;
	private String message;
	private String postId;
	private String fullName;
	private String albumId;
	private boolean isEdited;
	private boolean isImagePost;
	private List<Image> images;
	private String imageCount;
	private List<CommentResponse> postComments;
	private long commentCount;
	private long remainCommentCount;
	private String title;
	private LikeResponse postLikes;
	private Boolean liked;
	private String parentPostId;
	private String shareImgId;
	private PostResponse parentPost;
	private List<String> tagUsers;
	private SharedResponse shares;
	private List<UserInfo> tagUsersInfo;
	private long commentPageSize;
	private String location;
	private boolean tagged;
	private String emoKey;
	private String emoValue;
	private List<String> accessUserFullNames;
	
	
	
	

	
	
	public List<String> getAccessUserFullNames() {
		return accessUserFullNames;
	}

	public void setAccessUserFullNames(List<String> accessUserFullNames) {
		this.accessUserFullNames = accessUserFullNames;
	}

	public List<String> getTagUsers() {
		return tagUsers;
	}

	public void setTagUsers(List<String> tagUsers) {
		this.tagUsers = tagUsers;
	}

	public SharedResponse getShares() {
		return shares;
	}

	public void setShares(SharedResponse shares) {
		this.shares = shares;
	}

	public boolean isEdited() {
		return isEdited;
	}

	public void setEdited(boolean isEdited) {
		this.isEdited = isEdited;
	}

	public long getRemainCommentCount() {
		return remainCommentCount;
	}

	public void setRemainCommentCount(long remainCommentCount) {
		this.remainCommentCount = remainCommentCount;
	}

	public LikeResponse getPostLikes() {
		return postLikes;
	}

	public void setPostLikes(LikeResponse postLikes) {
		this.postLikes = postLikes;
	}
	private UserInfo userInfo;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getImageCount() {
		return imageCount;
	}
	public void setImageCount(String imageCount) {
		this.imageCount = imageCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	private String type;
	
	private List<ToMap> postTo;
	private String link;
	private String video;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<ToMap> getPostTo() {
		return postTo;
	}
	public void setPostTo(List<ToMap> postTo) {
		this.postTo = postTo;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public boolean isImagePost() {
		return isImagePost;
	}
	public void setImagePost(boolean isImagePost) {
		this.isImagePost = isImagePost;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public List<CommentResponse> getPostComments() {
		return postComments;
	}
	public void setPostComments(List<CommentResponse> postComments) {
		this.postComments = postComments;
	}
	public long getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public Boolean getLiked() {
		return liked;
	}

	public void setLiked(Boolean liked) {
		this.liked = liked;
	}

	public String getParentPostId() {
		return parentPostId;
	}

	public void setParentPostId(String parentPostId) {
		this.parentPostId = parentPostId;
	}

	public String getShareImgId() {
		return shareImgId;
	}

	public void setShareImgId(String shareImgId) {
		this.shareImgId = shareImgId;
	}

	public PostResponse getParentPost() {
		return parentPost;
	}

	public void setParentPost(PostResponse parentPost) {
		this.parentPost = parentPost;
	}

	public List<UserInfo> getTagUsersInfo() {
		return tagUsersInfo;
	}

	public void setTagUsersInfo(List<UserInfo> tagUsersInfo) {
		this.tagUsersInfo = tagUsersInfo;
	}

	public long getCommentPageSize() {
		return commentPageSize;
	}

	public void setCommentPageSize(long commentPageSize) {
		this.commentPageSize = commentPageSize;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isTagged() {
		return tagged;
	}

	public void setTagged(boolean tagged) {
		this.tagged = tagged;
	}

	public String getEmoKey() {
		return emoKey;
	}

	public void setEmoKey(String emoKey) {
		this.emoKey = emoKey;
	}

	public String getEmoValue() {
		return emoValue;
	}

	public void setEmoValue(String emoValue) {
		this.emoValue = emoValue;
	}

	
}
