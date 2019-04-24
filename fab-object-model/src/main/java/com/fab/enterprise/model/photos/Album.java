package com.fab.enterprise.model.photos;

import java.util.Date;
import java.util.List;

import com.fab.enterprise.model.post.ImageLight;
import com.fab.enterprise.model.user.BaseBean;

public class Album extends BaseBean{
	
private static final long serialVersionUID = -6504794151706558187L;
	
	private String name;
	
	private String description;
	
	private String location;
	
	private Date date;
	
	private List<ImageLight> images;
	
	private long size;
	
	private String cover;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<ImageLight> getImages() {
		return images;
	}

	public void setImages(List<ImageLight> images) {
		this.images = images;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	
	
	

}
