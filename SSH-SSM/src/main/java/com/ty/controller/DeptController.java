package com.ty.controller;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.entity.Dept;
import com.ty.entity.Employee;
import com.ty.entity.Staff;
import com.ty.service.imp.DeptService;
import com.ty.service.imp.UserService;

import javafx.beans.property.IntegerProperty;

@Controller
public class DeptController {
	@Autowired
	private DeptService deptService;

	@RequestMapping("/queryAllDept")
	public String queryAllDept(Model model) throws Exception {
		List<Dept> depts = deptService.findDeptAll();
		System.out.println(depts);
		model.addAttribute("dept", depts);
		System.out.println("进到部门查询了");
		return "/WEB-INF/jsp/dept/dept.jsp";
	}

	@RequestMapping("addOneDept")
	public String addOneDept(Dept dept) throws Exception {
		System.out.println("进到部门添加了");
		deptService.saveDept(dept);
		return "redirect:/queryAllDept";
	}

	@RequestMapping("deleteDept")
	public String deleteDept(String dId) throws Exception {
		System.out.println("dId.length()" + dId.length());
		// 字符串中是否包含逗號，不包含就刪除一個，包含就刪除多個
		if (!dId.contains(",")) {
			System.out.println(dId);
			int did = Integer.parseInt(dId);
			//设置员工对应的部门id为空
			UpdateEmpDidByEid(did);
			//删除一个部门
			deptService.deleteDeptById(did);
		} else if (dId.contains(",")) {
			String[] ids = dId.split(",");
			int[] id2 = new int[ids.length];
			int i = 0;
			for (String id1 : ids) {
				id2[i++] = Integer.parseInt(id1);
			}
			for (int j = 0; j < id2.length; j++) {
				UpdateEmpDidByEid(id2[j]);
			}
			deptService.deleteDeptByIds(id2);
		}
		return "redirect:/queryAllDept";
	}
	
	//通过部门的id查找员工，并且更新员工中对应部门的id为空
	private void UpdateEmpDidByEid(int did) {
		int[] ids = deptService.findEmpsEidByDid(did);
		for (int i : ids) {
			System.out.println(""+i);
			deptService.updateDidByEmpId(i);
		}
	}

	@RequestMapping("findOneDept")
	public String findOneDept(String dId, Model model) throws Exception {
		System.out.println("发现一个部门信息");
		int id1 = Integer.parseInt(dId);
		Dept dept = deptService.findDeptById(id1);
		model.addAttribute("dept", dept);
		return "/WEB-INF/jsp/dept/showUpdateDept.jsp";
	}

	@RequestMapping("/updateOneDept")
	public String updateOneDept(Dept dept) throws Exception {
		System.out.println(dept);
		deptService.updateDept(dept);
		return "redirect:/queryAllDept";
	}

	@RequestMapping("/findOneDeptLike")
	public String findOneDeptLike(String dName, Model model) throws Exception {
		System.out.println(dName);
		List<Dept> depts = deptService.findDeptByNameLike(dName);
		model.addAttribute("dept", depts);
		return "/WEB-INF/jsp/dept/dept.jsp";
	}
}
