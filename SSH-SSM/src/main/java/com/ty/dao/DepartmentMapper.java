package com.ty.dao;

import com.ty.entity.Dept;
import com.ty.entity.Employee;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description:查询所有的部门 
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午6:51:43 
	* Modification History:
	 */
	List<Dept> findDeptsAll();
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 保存一个部门
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午6:57:01 
	* Modification History:
	 */
	void saveOneDept(Dept dept);
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 删除部门
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午7:02:28 
	* Modification History:
	 */
	void deleteDeptsByIds(@Param("ids")int[] ids);
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 通过id发现一个部门
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午7:12:43 
	* Modification History:
	 */
	Dept findOneDeptById(@Param("dId")int dId);
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 更新一个部门
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午7:18:17 
	* Modification History:
	 */
	void updateOneDept(Dept dept);
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 通过名字模糊查询部门
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午7:24:38 
	* Modification History:
	 */
	List<Dept> findDeptsLikeByName(@Param("dName")String name);
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 通过部门的id发现一个员工,并且更新员工中对应的部门id
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午7:36:30 
	* Modification History:
	 */
	int[] findEmpEidByDid(int did);
	/**
	 * 
	* @Function: DepartmentMapper.java
	* @Description: 通过员工的id更新部门的id
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午8:22:56 
	* Modification History:
	 */
	void updateDidsByEmpId(@Param("i")int i);

}