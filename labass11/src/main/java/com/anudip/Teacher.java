package com.anudip;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="teacher_info")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;//declare private data member
	 private String name;
	 private String dept;
	 @OneToMany //for one to many mapping
	 private List<Course> course;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tid, String name, String dept, List<Course> course) {
		super();
		this.tid = tid;
		this.name = name;
		this.dept = dept;
		this.course = course;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	 
}
