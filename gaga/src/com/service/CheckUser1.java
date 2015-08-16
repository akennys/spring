package com.service;

public class CheckUser1 implements ValidateUser {

	@Override
	public String check(String user) {
		return "到xml验证，" + user + "存在！";
	}

}
