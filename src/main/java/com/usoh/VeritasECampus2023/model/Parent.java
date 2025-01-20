package com.usoh.VeritasECampus2023.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Parent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String occupation;
	@ManyToOne
	private Student student;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Student getStudents() {
		return student;
	}
	public void setStudents(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Parent [id=" + id + ", title=" + title + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", phone=" + phone + ", occupation=" + occupation + ", student=" + student + "]";
	}
	public Parent(long id, String title, String fname, String lname, String email, String phone, String occupation,
			Student student) {
		super();
		this.id = id;
		this.title = title;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.occupation = occupation;
		this.student = student;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
