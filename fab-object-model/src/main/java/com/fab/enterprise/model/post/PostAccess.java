package com.fab.enterprise.model.post;

public enum PostAccess {
	
	
	PUBLIC("1"),
	FRIENDS("2"),
	ONLYME("3"),
	CUSTOM("4"),
	CIRCLES("5");
	
	private String code;

	PostAccess(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
	
}
