package com.service;

public class CheckUser2 implements ValidateUser {

	@Override
	public String check(String user) {
		return "到数据库验证，" + user + "存在！";
	}

}
