package com.time.main.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;

@Document(collection = "Productivity")
public class User {


	@Id
	private int userid;
	private String name;
	private List<Softwares> apps;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String  duration;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Softwares> getApps() {
		return apps;
	}
	public void setApps(List<Softwares> apps) {
		this.apps = apps;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", apps=" + apps + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", duration=" + duration + "]";
	}
	
	
	
}