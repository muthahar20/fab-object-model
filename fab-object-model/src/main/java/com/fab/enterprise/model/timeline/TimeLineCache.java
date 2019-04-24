package com.fab.enterprise.model.timeline;

import java.util.List;

import com.fab.enterprise.model.TimeLine;
import com.fab.enterprise.model.user.BaseBean;


public class TimeLineCache extends BaseBean{
	
	private static final long serialVersionUID = -3869269866521230222L;

	private TimeLine timeLine;
	private Boolean isDirty;
	private String userName;
	private Boolean isFriend;

	public TimeLine getTimeLine() {
		return timeLine;
	}
	public void setTimeLine(TimeLine timeLine) {
		this.timeLine = timeLine;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Boolean getIsDirty() {
		return isDirty;
	}
	public void setIsDirty(Boolean isDirty) {
		this.isDirty = isDirty;
	}
	public Boolean getIsFriend() {
		return isFriend;
	}
	public void setIsFriend(Boolean isFriend) {
		this.isFriend = isFriend;
	}

	
	
}
