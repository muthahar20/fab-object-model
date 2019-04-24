package com.fab.enterprise.model.post;

import java.util.List;

import com.fab.enterprise.model.user.BaseBean;


public class Post extends BaseBean{

	private static final long serialVersionUID = 5431763683207428652L;

	private String userName;
	private String fullName;
	private String message;
	private String postId;
	private String albumName;
	private boolean isImagePost;
	private boolean isEdited;
	private String albumId;
	private String type;
	private Boolean reComments;
	private Boolean reSharing;
	private Boolean friendsAddPhotos;
	private Boolean postToFriends;
	private Boolean postToCircles;
	private List<ToMap> postTo;
	private List<Image> images;
	private String link;
	private String video;
	private String imageCount;
	private String title;
	private String parentPostId;
	private String shareImgId;
	private List<String> tagUsers;
	List<String> userList = null;
	List<String> circleList = null;
	private String location;
	private String emoKey;
	private String emoValue;
	private List<String> accessUserFullNames;

	
	
	
	public List<String> getAccessUserFullNames() {
		return accessUserFullNames;
	}
	public void setAccessUserFullNames(List<String> accessUserFullNames) {
		this.accessUserFullNames = accessUserFullNames;
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
	public boolean isEdited() {
		return isEdited;
	}
	public void setEdited(boolean isEdited) {
		this.isEdited = isEdited;
	}
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean isReComments() {
		return reComments;
	}
	public void setReComments(boolean reComments) {
		this.reComments = reComments;
	}
	public Boolean isReSharing() {
		return reSharing;
	}
	public void setReSharing(Boolean reSharing) {
		this.reSharing = reSharing;
	}
	public Boolean isFriendsAddPhotos() {
		return friendsAddPhotos;
	}
	public void setFriendsAddPhotos(Boolean friendsAddPhotos) {
		this.friendsAddPhotos = friendsAddPhotos;
	}
	public Boolean isPostToFriends() {
		return postToFriends;
	}
	public void setPostToFriends(Boolean postToFriends) {
		this.postToFriends = postToFriends;
	}
	public Boolean isPostToCircles() {
		return postToCircles;
	}
	public void setPostToCircles(Boolean postToCircles) {
		this.postToCircles = postToCircles;
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

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public List<ToMap> getPostTo() {
		return postTo;
	}
	public void setPostTo(List<ToMap> postTo) {
		this.postTo = postTo;
	}
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public boolean isImagePost() {
		return isImagePost;
	}
	public void setImagePost(boolean isImagePost) {
		this.isImagePost = isImagePost;
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
	public List<String> getUserList() {
		return userList;
	}
	public void setUserList(List<String> userList) {
		this.userList = userList;
	}
	public List<String> getCircleList() {
		return circleList;
	}
	public void setCircleList(List<String> circleList) {
		this.circleList = circleList;
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
	public List<String> getTagUsers() {
		return tagUsers;
	}
	public void setTagUsers(List<String> tagUsers) {
		this.tagUsers = tagUsers;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


}
