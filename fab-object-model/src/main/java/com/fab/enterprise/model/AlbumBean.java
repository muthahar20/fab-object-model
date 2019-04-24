package com.fab.enterprise.model;

import java.util.Date;
import java.util.List;

import com.fab.enterprise.model.post.ImageLight;
import com.fab.enterprise.model.user.BaseBean;


public class AlbumBean extends BaseBean{

	private static final long serialVersionUID = -6504794151706558187L;
	
	private String albumName;
	
	private String description;
	
	private String location;
	
	private Date date;
	
	private String userName;

	private String privacy;	
	
	private String albumId;
	
	private List<ImageLight> images;
	
	private long imageCount;
	
	private String fullName;
	
	private String albumCover;
	
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAlbumCover() {
		return albumCover;
	}

	public void setAlbumCover(String albumCover) {
		this.albumCover = albumCover;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public List<ImageLight> getImages() {
		return images;
	}

	public void setImages(List<ImageLight> images) {
		this.images = images;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	
	public long getImageCount() {
		return imageCount;
	}

	public void setImageCount(long imageCount) {
		this.imageCount = imageCount;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "AlbumBean [albumName=" + albumName + ", description="
				+ description + ", location=" + location + ", date=" + date
				+ ", userName=" + userName + ", privacy=" + privacy
				+ ", albumId=" + albumId + ", images=" + images
				+ ", imageCount=" + imageCount + ", fullName=" + fullName
				+ ", albumCover=" + albumCover + ", type=" + type + "]";
	}	

}
