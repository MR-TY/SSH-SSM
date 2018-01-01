package com.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.StaffMapper;
import com.ty.entity.Staff;

@Service
@Transactional
public class StaffService  {
	@Autowired
	private StaffMapper staffMapper;
	public List<Staff> findStaffAll() throws Exception {
		return staffMapper.findAllStaff();
	}

	public List<Staff> findStaffByNameLike(String name) throws Exception {
		return staffMapper.findStaffByName("%"+name+"%");
	}

	public void deleteStaffById(int id) throws Exception {
		deleteStaffByIds(new int[] { id });
	}

	public void deleteStaffByIds(int... ids) throws Exception {
		staffMapper.deleteStaffsByIds(ids);
	}

	public void updateStaff(Staff staff) throws Exception {
		staffMapper.updateOneStaff(staff);
	}

	public void deleteStaffByObj(Staff staff) throws Exception {

	}

	public void saveStaff(Staff staff) throws Exception {
		staffMapper.saveOneStaff(staff);
	}

	public Staff findStaffById(int staffId) throws Exception {
		return staffMapper.findOneStaffById(staffId);
	}

	public int[] findEmpIdsById(int staffId1) {
		return staffMapper.findEIdBySId(staffId1);
	}

	public void updateEmpsSid(int i) {
		staffMapper.updateEmpsId(i);
	}

}
