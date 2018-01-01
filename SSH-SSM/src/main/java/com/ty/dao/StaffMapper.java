package com.ty.dao;

import com.ty.entity.Staff;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description:发现全部的职位 
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午8:40:15 
	* Modification History:
	 */
	List<Staff> findAllStaff();
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 保存一个职位
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午8:43:51 
	* Modification History:
	 */
	void saveOneStaff(Staff staff);
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 删除职位
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午8:47:32 
	* Modification History:
	 */
	void deleteStaffsByIds(@Param("ids")int[] ids);
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 根据名字模糊查询职位
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午10:14:11 
	* Modification History:
	 */
	List<Staff> findStaffByName(@Param("name")String name);
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 通过id查找职位
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午10:19:58 
	* Modification History:
	 */
	Staff findOneStaffById(@Param("staffId")int staffId);
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 更新职位
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午10:24:18 
	* Modification History:
	 */
	void updateOneStaff(Staff staff);
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 通过职位的id发现员工的id
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午10:41:03 
	* Modification History:
	 */
	int[] findEIdBySId(@Param("staffId")int staffId);
	/**
	 * 
	* @Function: StaffMapper.java
	* @Description: 通过员工的id设置职位的id为null
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午10:44:29 
	* Modification History:
	 */
	void updateEmpsId(@Param("i")int i);
	
}