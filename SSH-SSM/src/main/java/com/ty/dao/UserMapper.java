package com.ty.dao;

import com.ty.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	/**
	 * 
	* @Function: UserMapper.java
	* @Description: 通过用户名和密码寻找用户
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 上午9:26:02 
	* Modification History:
	 */
    User findUserByLoginNameAndPwd(@Param("uloginName")String uloginName,@Param("upwd")String upwd);
    /**
     * 
    * @Function: UserMapper.java
    * @Description: 通过用户名找密码
    *
    * @param:描述1描述
    * @return：返回结果描述
    * @throws：异常描述
    * @version: v1.0.0
    * @author: 唐宇
    * @date: 2018年1月2日 上午9:27:04 
    * Modification History:
     */
    String findPwdByuLoginName(@Param("uloginName")String uloginName);
    /**
     * 
    * @Function: UserMapper.java
    * @Description:发现全部的用户 
    *
    * @param:描述1描述
    * @return：返回结果描述
    * @throws：异常描述
    * @version: v1.0.0
    * @author: 唐宇
    * @date: 2018年1月2日 上午9:57:47 
    * Modification History:
     */
    List<User> findAllUsers();
    /**
     * 
    * @Function: UserMapper.java
    * @Description: 通过状态和名字发现用户
    *
    * @param:描述1描述
    * @return：返回结果描述
    * @throws：异常描述
    * @version: v1.0.0
    * @author: 唐宇
    * @date: 2018年1月2日 上午10:20:56 
    * Modification History:
     */
    List<User> findUsersByNameAndState(@Param("uLoginName")String uLoginName,@Param("state")Integer state);
	/**
	 * 
	* @Function: UserMapper.java
	* @Description: 通过id查找用户
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 上午11:23:48 
	* Modification History:
	 */
    User findOneUserById(@Param("eId")Integer eId);
    /**
     * 
    * @Function: UserMapper.java
    * @Description: 更新用户
    *
    * @param:描述1描述
    * @return：返回结果描述
    * @throws：异常描述
    * @version: v1.0.0
    * @author: 唐宇
    * @date: 2018年1月2日 下午2:06:22 
    * Modification History:
     */
	void updateUser(User user);
	/**
	 * 
	* @Function: UserMapper.java
	* @Description: 通过id发现密码
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午2:31:48 
	* Modification History:
	 */
	String findPwd(@Param("eId")int eId);
	/**
	 * 
	* @Function: UserMapper.java
	* @Description:删除多个用户
	* 
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月2日 下午3:49:43 
	* Modification History:
	 */
	void deleteUsersByIds(@Param("ids")int[] ids);
	/**
	 * 
	* @Function: UserMapper.java
	* @Description: 保存用户
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午2:46:28 
	* Modification History:
	 */
	void saveUser(User user);
	
}