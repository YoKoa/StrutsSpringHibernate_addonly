package com.zhangzhen.dao;

import com.zhangzhen.users.user;

public interface userDAO {
	public void save(user user);
	public void delete(String id);
	public user getUser(String usernme);
}
