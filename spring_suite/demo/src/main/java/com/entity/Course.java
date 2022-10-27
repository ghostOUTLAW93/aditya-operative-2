package com.entity;

public class Course {

	private int id;
	private String title;
	private String desc;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String title, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", desc=" + desc + "]";
	}
	
	
}
