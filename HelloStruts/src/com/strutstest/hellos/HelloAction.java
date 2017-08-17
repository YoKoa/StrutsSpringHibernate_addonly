package com.strutstest.hellos;

import com.opensymphony.xwork2.ActionSupport;
import com.zhangzhen.dao.userDAO;
import com.zhangzhen.userimpi.userDAOimpi;
import com.zhangzhen.users.user;

public class HelloAction extends ActionSupport {
	
	//动态方法调用
	private String username;
	private String password;
	
	private userDAO userm = new userDAOimpi();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute()
	{
		//转到一个显示页面
		userm.save(new user(username,password));
		System.out.print("执行action成功");
		System.out.print(username);
		return SUCCESS;
	}

}
