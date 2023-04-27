package com.wild.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	private int no;
	private String date;
	private String time;
	private String location;
	private String source;
	private String data;
	private String organiser;

	public Event() {
		super();
	}

	public Event(int no, String date, String time, String location, String source, String data, String organiser) {
		super();
		this.no = no;
		this.date = date;
		this.time = time;
		this.location = location;
		this.source = source;
		this.data = data;
		this.organiser = organiser;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	@Override
	public String toString() {
		return "Event [no=" + no + ", date=" + date + ", time=" + time + ", location=" + location + ", source=" + source
				+ ", data=" + data + ", organiser=" + organiser + "]";
	}

}
