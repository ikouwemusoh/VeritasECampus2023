package com.usoh.VeritasECampus2023.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
public class NextOfKin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fname;
	private String lname;
	private String relationship;
	private String phone;
	private String email;
	@OneToOne
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "NextOfKin [id=" + id + ", fname=" + fname + ", lname=" + lname + ", relationship=" + relationship
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	public NextOfKin(Long id, String fname, String lname, String relationship, String phone, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.relationship = relationship;
		this.phone = phone;
		this.email = email;
	}
	public NextOfKin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
