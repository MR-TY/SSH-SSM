package com.ty.service.imp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.DepartmentMapper;
import com.ty.entity.Dept;
import com.ty.entity.Employee;

@Service
@Transactional
public class DeptService{
	@Autowired
	private DepartmentMapper departmentMapper;
	public List<Dept> findDeptAll() throws Exception {
		return departmentMapper.findDeptsAll();
	}

	public List<Dept> findDeptByNameLike(String name) throws Exception {
		return departmentMapper.findDeptsLikeByName("%"+name+"%");
	}

	public void deleteDeptById(int id) throws Exception {
		deleteDeptByIds(new int[] { (Integer) id });
	}

	public void deleteDeptByIds(int... ids) throws Exception {
		departmentMapper.deleteDeptsByIds(ids);
	}

	public void updateDept(Dept dept) throws Exception {
		departmentMapper.updateOneDept(dept);
	}

	public void saveDept(Dept dept) throws Exception {
		departmentMapper.saveOneDept(dept);
	}

	public Dept findDeptById(int dId) throws Exception {
		return departmentMapper.findOneDeptById(dId);
	}

	public int[] findEmpsEidByDid(int did) {
		return departmentMapper.findEmpEidByDid(did);
	}

	public void updateDidByEmpId(int i) {
		departmentMapper.updateDidsByEmpId(i);
	}


}
