package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="std_tbl_41")

public class Student extends BaseEntity{
	
	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	@Column(length=30,unique =true,nullable=false)
	private String email;
	@Column(length=30)
	private String course;
	
	private String password;
	private LocalDate joinDate;
	private double marks;
	// write all getters setters tostring default and parameterized constructors
	
	
	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String email, String course,String password, LocalDate joinDate, double marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.course = course;
		this.password=password;
		this.joinDate = joinDate;
		this.marks = marks;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}
//	public Long getId() {
//		return super.getId();
//	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getCourse() {
		return course;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public double getMarks() {
		return marks;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	


}
