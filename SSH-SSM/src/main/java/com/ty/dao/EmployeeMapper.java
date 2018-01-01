package com.ty.dao;

import com.ty.entity.Employee;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	/**
	 * 
	* @Function: EmployeeMapper.java
	* @Description: 通过id发现对象
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午8:47:34 
	* Modification History:
	 */
	Employee findOneEmpByEid(@Param("geteId")int geteId);
	/**
	 * 
	* @Function: EmployeeMapper.java
	* @Description: 发现所有的员工
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午8:47:57 
	* Modification History:
	 */
	List<Employee> findAllEmps();
	/**
	 * 
	* @Function: EmployeeMapper.java
	* @Description: 保存员工
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年4月20日 上午12:44:33 
	* Modification History:
	 */
	void saveOneEmp1(Employee employee);
	/**
	 * 
	* @Function: EmployeeMapper.java
	* @Description: 删除员工
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午2:27:43 
	* Modification History:
	 */
	void deleteEmps(@Param("ids")int[] ids);
	/**
	 * 
	* @Function: EmployeeMapper.java
	* @Description: 模糊查询
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午3:16:51 
	* Modification History:
	 */
	List<Employee> findEmpsByLike(@Param("dId")int dId1, @Param("gender")int genderId, @Param("eName")String eName);
}