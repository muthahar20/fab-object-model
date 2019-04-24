package com.fab.enterprise.model.post;

import com.fab.enterprise.model.user.BaseBean;

public class ImageLight extends BaseBean{

	private static final long serialVersionUID = -6392145304399644033L;
	private String description;
	private String publicId;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	
	
}
