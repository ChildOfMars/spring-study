package com.pojo;

import java.util.List;

public class Leave {
	private String employeeName;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String contactNumber;
    private String leaveReason;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
    
    @Override
	public String toString() {
		return "Leave{" + "employeeName=" + employeeName + ", leaveType=" + leaveType + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", contactNumber=" + contactNumber + ", leaveReason=" + leaveReason + '}';
	}
}
