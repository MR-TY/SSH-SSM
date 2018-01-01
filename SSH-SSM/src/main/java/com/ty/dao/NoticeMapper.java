package com.ty.dao;

import com.ty.entity.Employee;
import com.ty.entity.Notice;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 查询所有的通告
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 上午9:11:37 
	* Modification History:
	 */
	List<Notice> findAllNotice();
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 创建一个公告
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 上午10:21:09 
	* Modification History:
	 */
	void saveOneNotice(Notice notice);
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 通过id查找员工
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 上午11:30:37 
	* Modification History:
	 */
	Employee findOneEmpByEid(int geteId);
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 通过id查询一个公告
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午2:19:31 
	* Modification History:
	 */
	Notice findOneNoticeById(@Param("nitoceId")int nitoceId);
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 更新notice
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午2:33:39 
	* Modification History:
	 */
	void updateNotice1(Notice notice);
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 通过id删除公告
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午2:52:13 
	* Modification History:
	 */
	void deleteNoticesByIded(@Param("ids")int[] ids);
	/**
	 * 
	* @Function: NoticeMapper.java
	* @Description: 模糊查找
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: 唐宇
	* @date: 2018年1月1日 下午3:08:46 
	* Modification History:
	 */
	List<Notice> findNoticesLike(@Param("noticeName")String noticeName, @Param("noticeContent")String noticeContent);
}