package com.ty.test;

import static org.junit.Assert.*;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ty.dao.DepartmentMapper;
import com.ty.dao.DownloadMapper;
import com.ty.dao.EmployeeMapper;
import com.ty.dao.NoticeMapper;
import com.ty.dao.UserMapper;
import com.ty.entity.Employee;
import com.ty.entity.Notice;
import com.ty.entity.User;
import com.ty.enum1.Gender;
import com.ty.utils.M5Utils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestMapper {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	NoticeMapper noticeMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	DownloadMapper downloadMapper;
	@Test
	public void test() throws NoSuchAlgorithmException {
		/*
		 * User user = userMapper.findUserByLoginNameAndPwd("admin",
		 * "202cb962ac59075b964b07152d234b70");
		 * System.out.println("user:--------"+user); String pwd =
		 * userMapper.findPwdByuLoginName("admin");
		 * System.out.println("pwd:------"+pwd); String pwd =
		 * M5Utils.getM5Parame("123"); System.out.println(pwd); List<User> users
		 * = userMapper.findAllUsers(); System.out.println(users); List<User>
		 * users = userMapper.findUsersByNameAndState("%a%", null);
		 * System.out.println("users----------------"+users); User user =
		 * userMapper.findOneUserById(1); System.out.println("通过ID查询"+user);
		 * String pwdString = userMapper.findPwd(1);
		 * System.out.println(pwdString);
		 * 
		 * userMapper.updateUser(new User(1, null, "admin", "123", 2, new
		 * Date())); System.out.println("更新成功"); int[] ids =
		 * departmentMapper.findEmpEidByDid(1); for (int i : ids) {
		 * System.out.println(""+i); }
			List<Notice> notices = noticeMapper.findAllNotice();
			System.out.println(notices);
			Employee employee = employeeMapper.findOneEmpByEid(1);
			System.out.println(employee);*/
		/*String path = downloadMapper.findPathById(20);
		System.out.println(path);*/
//		String path = "D:\\8.0Tomacat\\apache-tomcat-8.0.50\\wtpwebapps\\SSH-SSM\\upLoad\\新建文本文档.txt";
//		File file = new File(path);
//		file.delete();
		/*System.out.println("-----------"+Gender.woman);
		employeeMapper.saveOneEmp1(new Employee("kkhhh", Gender.man));*/
		List<Employee> employee = employeeMapper.findEmpsByLike(0, 0, "%"+"a"+"%");
		System.out.println("-----------------"+employee);
	}
}
