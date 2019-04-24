package com.fab.enterprise.model.timeline;

import java.io.Serializable;

public class TimeLinePhotos implements Serializable{
	private static final long serialVersionUID = -479461309767122488L;
	
	private String imageId;
	private String publicId;
	
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	
	

}
