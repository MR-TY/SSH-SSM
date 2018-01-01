package com.ty.entity;

import java.util.Date;

public class DownLoad {
	private int downloadId;
	private String downloadTitle;
	private Date downloadCreateTime;
	private int eId;
	private Employee employee;
	private String downloadDes;
	private String downloadPath;
	public int getDownloadId() {
		return downloadId;
	}
	public void setDownloadId(int downloadId) {
		this.downloadId = downloadId;
	}
	public String getDownloadTitle() {
		return downloadTitle;
	}
	public void setDownloadTitle(String downloadTitle) {
		this.downloadTitle = downloadTitle;
	}
	public Date getDownloadCreateTime() {
		return downloadCreateTime;
	}
	public void setDownloadCreateTime(Date downloadCreateTime) {
		this.downloadCreateTime = downloadCreateTime;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getDownloadDes() {
		return downloadDes;
	}
	public void setDownloadDes(String downloadDes) {
		this.downloadDes = downloadDes;
	}
	public String getDownPath() {
		return downloadPath;
	}
	public void setDownPath(String downPath) {
		this.downloadPath = downPath;
	}
}