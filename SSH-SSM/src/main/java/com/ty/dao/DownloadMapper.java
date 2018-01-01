package com.ty.dao;

import com.ty.entity.DownLoad;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadMapper {
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 发现全部的文档
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午5:37:15 
	* Modification History:
	 */
	List<DownLoad> findAllFile();
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 通过id发现一个文件
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午7:00:44 
	* Modification History:
	 */
	DownLoad findOneFile(@Param("downloadId")int downloadId);
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 上传文件
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午7:07:39 
	* Modification History:
	 */
	void saveFile(DownLoad download);
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 更新用户
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午7:27:44 
	* Modification History:
	 */
	void updateFile(DownLoad download);
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 删除多个文件
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午7:40:11 
	* Modification History:
	 */
	void deleteFileById(@Param("ids")int[] ids);
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 通过id发现地址
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	 * @return 
	* @date: 2018年1月1日 下午7:52:53 
	* Modification History:
	 */
	String findPathById(@Param("downloadId")int downloadId);
	/**
	 * 
	* @Function: DownloadMapper.java
	* @Description: 模糊查找文档
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午8:12:00 
	* Modification History:
	 */
	List<DownLoad> findFileByLike(@Param("downloadTitle")String downloadTitle);
}