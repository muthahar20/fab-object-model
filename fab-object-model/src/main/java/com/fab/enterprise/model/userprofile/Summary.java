package com.fab.enterprise.model.userprofile;

import com.fab.enterprise.model.user.BaseBean;

public class Summary extends BaseBean{

	private static final long serialVersionUID = 1L;

	private  ContactBasicInfoBean contactBasicInfo;
	
	private EducationBean education;
	
	private PlacesLivedBean placesLived;
	
	private WorkBean work;
	
	
	public ContactBasicInfoBean getContactBasicInfo() {
		return contactBasicInfo;
	}

	public void setContactBasicInfo(ContactBasicInfoBean contactBasicInfo) {
		this.contactBasicInfo = contactBasicInfo;
	}

	public EducationBean getEducation() {
		return education;
	}

	public void setEducation(EducationBean education) {
		this.education = education;
	}

	public PlacesLivedBean getPlacesLived() {
		return placesLived;
	}

	public void setPlacesLived(PlacesLivedBean placesLived) {
		this.placesLived = placesLived;
	}

	public WorkBean getWork() {
		return work;
	}

	public void setWork(WorkBean work) {
		this.work = work;
	}

	
	
}
