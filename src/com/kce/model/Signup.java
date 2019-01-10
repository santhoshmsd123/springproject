package com.kce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hibernate_sequence")
public class Signup{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="rollno")
	private String rollno;
	@Column(name="mailid")
	private String mailid;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="course")
	private String course;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Signup( String username, String rollno, String mailid, String password, String role,String course) {
		this.username = username;
		this.rollno = rollno;
		this.mailid = mailid;
		this.password = password;
		this.role = role;
		this.course=course;
	}
	public Signup() {
	}
	}
