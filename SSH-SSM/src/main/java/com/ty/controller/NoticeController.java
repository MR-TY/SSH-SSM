package com.ty.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.entity.Dept;
import com.ty.entity.Employee;
import com.ty.entity.Notice;
import com.ty.entity.Staff;
import com.ty.entity.User;
import com.ty.service.imp.EmployeeService;
import com.ty.service.imp.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping("/findAllNotice")
	public String queryAllDept(Model model) throws Exception {
		System.out.println("进来了---------------------------------------------");
		List<Notice> notices = noticeService.findNoticeAll();
		System.out.println(notices);
		model.addAttribute("notices", notices);
		return "/WEB-INF/jsp/notice/notice.jsp";
	}
	
	@RequestMapping("insertOneNotice")
	public String insertOneNotice(Notice notice,HttpServletRequest request) throws Exception {
		System.out.println("进到增加员工");
		notice.setNoticeCreateTime(new Date());
		getUser(notice,request);
		System.out.println("增加员工的notice----------"+notice);
		noticeService.saveNotice(notice);
		return "redirect:/findAllNotice";
	}
	
	@RequestMapping("findOneNotice")
	public String findOneNotice(String nitoceId,String nitoceId1, Model model) throws Exception {
		System.out.println("nitoceId------"+nitoceId+"---------nitoced1------"+nitoceId1);
		if (nitoceId!=null) {
			int id1 = Integer.parseInt(nitoceId);
			Notice notice = noticeService.findNoticeById(id1);
			model.addAttribute("notice", notice);
			return "/WEB-INF/jsp/notice/previewNotice.jsp";
		}
		//修改与展示都通过判断是否为空来区别
		if (nitoceId1!=null) {
			System.out.println("进到修改");
			int id1 = Integer.parseInt(nitoceId1);
			Notice notice = noticeService.findNoticeById(id1);
			model.addAttribute("notice", notice);
			return "/WEB-INF/jsp/notice/showUpdateNotice.jsp";
		}
		return null;
	}
	
	@RequestMapping("/updateOneNotice")
	public String updateOneNotice(Notice notice,HttpServletRequest request) throws Exception {
		notice.setNoticeCreateTime(new Date());
		getUser(notice,request);
		noticeService.updateNotice(notice);
		//更新之后进行保存，这样就能添加时间，知道公告是什么时候保存的
		insertOneNotice(notice,request);
		return "redirect:/findAllNotice";
	}
	
	@RequestMapping("deleteOneNotice")
	public String deleteDept(String nitoceId) throws Exception {
		System.out.println("nitoceId.length()" + nitoceId.length());
		// 字符串中是否包含逗號，不包含就刪除一個，包含就刪除多個
		if (!nitoceId.contains(",")) {
			System.out.println(nitoceId);
			int nitoceId1 = Integer.parseInt(nitoceId);
			noticeService.deleteNoticeById(nitoceId1);
		} else if (nitoceId.contains(",")) {
			String[] ids = nitoceId.split(",");
			int[] id2 = new int[ids.length];
			int i = 0;
			for (String id1 : ids) {
				id2[i++] = Integer.parseInt(id1);
			}
			noticeService.deleteNoticeByIds(id2);
		}
		return "redirect:/findAllNotice";
	}
	
	@RequestMapping("/findNotceLikeByNameAndContent")
	public String findNotceLikeByNameAndContent(String noticeName,String noticeContent,Model model) throws Exception {
		List<Notice> notices = noticeService.findNotceLikeByNameAndContent(noticeName, noticeContent);
		model.addAttribute("notices", notices);
		return "/WEB-INF/jsp/notice/notice.jsp";
	}
	
	//-------------获取session中的对象----------
	private void getUser(Notice notice, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		//利用eId与sql数据表中对应上，然后把取到的user的eid值放进去，这样就能查出显示的员工名字
		notice.seteId(user.geteId());
		System.out.println("session中的对象notice--------"+notice);
	}

}
