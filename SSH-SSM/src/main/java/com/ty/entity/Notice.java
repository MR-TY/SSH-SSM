package com.ty.entity;

import java.util.Date;

public class Notice {
	private int nitoceId;
	private String noticeName;
	private String noticeContent;
	private Date noticeCreateTime;
	private int eId;
	private Employee employee;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getNitoceId() {
		return nitoceId;
	}

	public void setNitoceId(int nitoceId) {
		this.nitoceId = nitoceId;
	}

	public String getNoticeName() {
		return noticeName;
	}

	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeCreateTime() {
		return noticeCreateTime;
	}

	public void setNoticeCreateTime(Date noticeCreateTime) {
		this.noticeCreateTime = noticeCreateTime;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Notice [nitoceId=" + nitoceId + ", noticeName=" + noticeName + ", noticeContent=" + noticeContent
				+ ", noticeCreateTime=" + noticeCreateTime + ", employee=" + employee + "]";
	}
}