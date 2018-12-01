package com.joney.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joney.mapper.SysUserMapper;
import com.joney.pojo.SysUser;
import com.joney.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	SysUserMapper sum;
	
	@Override
	public void saveUser(SysUser su) {
		sum.insert(su);
		
	}

	@Override
	public void updateUser(SysUser su) {
		sum.updateByPrimaryKeySelective(su);
		
	}

	@Override
	public void deleteUser(String id) {
		sum.deleteByPrimaryKey(id);
		
	}

	@Override
	public SysUser queryUserById(String id) {
		
		return sum.selectByPrimaryKey(id);
	}

	@Override
	public List<SysUser> queryUserList(SysUser su) {
		
		return sum.selectAll();
	}

}
