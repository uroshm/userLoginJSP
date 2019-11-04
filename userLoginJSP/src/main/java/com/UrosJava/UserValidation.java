package com.UrosJava;

public class UserValidation {
	
	public UserValidation() {
		//empty construct; do nothing
	}
	
	public boolean userIsValid(String user, String pass) {
		if(user.equals("uros") && pass.equals("asdf")) {
			return true;
		} else {
			return false;
		}
	}
}
