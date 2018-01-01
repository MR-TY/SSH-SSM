package com.ty.service.imp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ty.dao.NoticeMapper;
import com.ty.entity.Employee;
import com.ty.entity.Notice;

@Service
@Transactional
public class NoticeService{
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	public List<Notice> findNoticeAll() throws Exception {
		return noticeMapper.findAllNotice();
	}

	public void deleteNoticeById(int id) throws Exception {
		deleteNoticeByIds(new int[] { (Integer) id });
	}

	public void deleteNoticeByIds(int... ids) throws Exception {
		noticeMapper.deleteNoticesByIded(ids);
	}

	public void updateNotice(Notice notice) throws Exception {
		noticeMapper.updateNotice1(notice);
	}

	public void deleteNoticeByObj(Notice Notice) throws Exception {
		
	}

	public void saveNotice(Notice notice) throws Exception {
		noticeMapper.saveOneNotice(notice);
	}

	public Notice findNoticeById(int dId) throws Exception {
		return noticeMapper.findOneNoticeById(dId);
	}

	public List<Notice> findNotceLikeByNameAndContent(String noticeName, String noticeContent) throws Exception {
		return noticeMapper.findNoticesLike("%"+noticeName+"%","%"+noticeContent+"%");
	}



	
}
