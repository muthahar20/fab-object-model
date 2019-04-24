package com.fab.enterprise.model.post;

import com.fab.enterprise.model.user.BaseBean;

public class BaseResponse extends BaseBean {
	private static final long serialVersionUID = -4476381114543233214L;
private UserInfo userInfo;

public UserInfo getUserInfo() {
	return userInfo;
}

public void setUserInfo(UserInfo userInfo) {
	this.userInfo = userInfo;
}


	
	
}
