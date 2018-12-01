package com.joney.service;

import java.util.List;

import com.joney.pojo.SysUser;

public interface UserService {
	
	public void saveUser(SysUser su) throws Exception;
	
	public void updateUser(SysUser su);
	
	public void deleteUser(String id);
	
	public SysUser queryUserById(String id);
	
	public List<SysUser> queryUserList(SysUser su);
}
