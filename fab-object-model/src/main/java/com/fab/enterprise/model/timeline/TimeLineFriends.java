package com.fab.enterprise.model.timeline;

import java.io.Serializable;
import java.util.List;

import com.fab.enterprise.model.post.UserInfo;


public class TimeLineFriends implements Serializable{

	private static final long serialVersionUID = 3595524635756023326L;
	
	private long friends;
	
	private long mutuals;
	
	private List<UserInfo> friendList;
	
	public long getFriends() {
		return friends;
	}
	
	public void setFriends(long friends) {
		this.friends = friends;
	}
	
	public long getMutuals() {
		return mutuals;
	}
	
	public void setMutuals(long mutuals) {
		this.mutuals = mutuals;
	}
	
	public List<UserInfo> getFriendList() {
		return friendList;
	}
	
	public void setFriendList(List<UserInfo> friendList) {
		this.friendList = friendList;
	}
	

}
