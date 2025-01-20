package com.usoh.VeritasECampus2023.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String gender;
	private String fname;
	private String mname;
	private String lname;
	private LocalDate dob;
	private String password;
	private boolean isActive;
	private boolean isBlocked;
	private LocalDateTime createdDate;
	private String privateEmail;
	private int phone;
	private String user_type;
	@OneToOne
	private NextOfKin nextOfKin;
	@OneToOne
	private Address address;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getPrivateEmail() {
		return privateEmail;
	}
	public void setPrivateEmail(String privateEmail) {
		this.privateEmail = privateEmail;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public NextOfKin getNextOfKin() {
		return nextOfKin;
	}
	public void setNextOfKin(NextOfKin nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", gender=" + gender + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname
				+ ", dob=" + dob + ", password=" + password + ", isActive=" + isActive + ", isBlocked=" + isBlocked
				+ ", createdDate=" + createdDate + ", privateEmail=" + privateEmail + ", phone=" + phone
				+ ", user_type=" + user_type + ", nextOfKin=" + nextOfKin + ", address=" + address + "]";
	}
	public User(long id, String gender, String fname, String mname, String lname, LocalDate dob, String password,
			boolean isActive, boolean isBlocked, LocalDateTime createdDate, String privateEmail, int phone,
			String user_type, NextOfKin nextOfKin, Address address) {
		super();
		this.id = id;
		this.gender = gender;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.dob = dob;
		this.password = password;
		this.isActive = isActive;
		this.isBlocked = isBlocked;
		this.createdDate = createdDate;
		this.privateEmail = privateEmail;
		this.phone = phone;
		this.user_type = user_type;
		this.nextOfKin = nextOfKin;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
