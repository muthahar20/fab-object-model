package com.fab.enterprise.model;

import java.util.List;

import com.fab.enterprise.model.post.Notification;



public class NotificatonResponse {

	private List<Notification> notificationList;
	private long unReadCount;
	
	public List<Notification> getNotificationList() {
		return notificationList;
	}
	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}
	public long getUnReadCount() {
		return unReadCount;
	}
	public void setUnReadCount(long unReadCount) {
		this.unReadCount = unReadCount;
	}
	
	
	
	
	
	

}
