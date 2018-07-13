package com.airlinestatus.model;

import java.util.Date;


public class AirlineStatus {
	
	
	private String fligthnum;
	

	private String origincity;
	
	
	private String destcity;
	
	
	private String boardinggate;
	
	
	private String beltnum;
	
	
	private String carpark;
	
	
	private String terminalnum;
	
	
	private String checkinrow;
	
	
	private String status;
	
	public String getFligthnum() {
		return fligthnum;
	}

	public void setFligthnum(String fligthnum) {
		this.fligthnum = fligthnum;
	}

	public String getOrigincity() {
		return origincity;
	}

	public void setOrigincity(String origincity) {
		this.origincity = origincity;
	}

	public String getDestcity() {
		return destcity;
	}

	public void setDestcity(String destcity) {
		this.destcity = destcity;
	}

	public String getBoardinggate() {
		return boardinggate;
	}

	public void setBoardinggate(String boardinggate) {
		this.boardinggate = boardinggate;
	}

	public String getBeltnum() {
		return beltnum;
	}

	public void setBeltnum(String beltnum) {
		this.beltnum = beltnum;
	}

	public String getCarpark() {
		return carpark;
	}

	public void setCarpark(String carpark) {
		this.carpark = carpark;
	}

	public String getTerminalnum() {
		return terminalnum;
	}

	public void setTerminalnum(String terminalnum) {
		this.terminalnum = terminalnum;
	}

	public String getCheckinrow() {
		return checkinrow;
	}

	public void setCheckinrow(String checkinrow) {
		this.checkinrow = checkinrow;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	private Date createdAt;

	
}
