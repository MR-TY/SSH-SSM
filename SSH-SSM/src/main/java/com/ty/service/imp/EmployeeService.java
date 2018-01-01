package com.ty.service.imp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.EmployeeMapper;
import com.ty.entity.Employee;

@Service
@Transactional
public class EmployeeService{
	@Autowired
	private EmployeeMapper employeeMapper;
	public List<Employee> findEmployeeAll() throws Exception {
		return employeeMapper.findAllEmps();
	}

	public List<Employee> findEmployeeByNameLike(String name) throws Exception {
		
		return null;
	}

	public void deleteEmployeeById(int id) throws Exception {
		deleteEmployeeByIds(new int[] { (Integer) id });
	}

	public void deleteEmployeeByIds(int... ids) throws Exception {
		employeeMapper.deleteEmps(ids);	
	}

	public void updateEmployee(Employee employee) throws Exception {

	}
	
	public void saveEmployee(Employee employee) throws Exception {
		employeeMapper.saveOneEmp1(employee);
	}

	public Employee findEmployeeById(int dId) throws Exception {
		return null;
	}

	public List<Employee> findEmployeeByMany(int dId1, int genderId, String eName) {
		return employeeMapper.findEmpsByLike(dId1,genderId,"%"+eName+"%");
	}
	public Employee findOneEmpById(@Param("eId")int geteId) {
		return employeeMapper.findOneEmpByEid(geteId);
	}
}
