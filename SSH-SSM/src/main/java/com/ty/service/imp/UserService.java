package com.ty.service.imp;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.UserMapper;
import com.ty.entity.User;
import com.ty.utils.M5Utils;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public List<User> findUserAll() throws Exception {
		return userMapper.findAllUsers();
	}

	public User findUserById(Serializable id) throws Exception {
		return null;
	}

	public void deleteUserById(int id) throws Exception {
		deleteUserByIds(new int[] { (Integer) id });
	}

	public void deleteUserByIds(int... ids) throws Exception {
		userMapper.deleteUsersByIds(ids);
	}

	public List<User> findUserByNameAndState(String name, Integer state) throws Exception {
		return userMapper.findUsersByNameAndState("%"+name+"%",state);
	}

	public void updateUser(User user) throws Exception {
		userMapper.updateUser(user);
	}

	public User findUserByUserNameAndPassword(User user) throws Exception {
		System.out.println("User:"+user);
		String loginName = user.getuLoginName();
		String password = userMapper.findPwdByuLoginName(loginName);
		System.out.println("password:"+password);
		String passWord1 = M5Utils.getM5Parame(user.getuPwd());
		System.out.println("passWord1:"+passWord1);
		if (password != null) {
			if (password.equals(passWord1)) {
				System.out.println("满足条件之后进行对象的查询");
				User user2 = userMapper.findUserByLoginNameAndPwd(loginName,passWord1);
				System.out.println("user2"+user2);
				return user2;
			}
		}
	    throw new RuntimeException("发生错误");
	}

	public String findPwdByEId(int eId) throws Exception {
		
		return userMapper.findPwd(eId);
	}

	public void addOneUser(User user) {
		userMapper.saveUser(user);
	}

	public User findObject1(Integer eId) {
		return userMapper.findOneUserById(eId);
	}
	
	
}
