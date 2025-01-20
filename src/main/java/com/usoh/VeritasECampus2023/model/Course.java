package com.usoh.VeritasECampus2023.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String course_code;
	private String description;
	private int credit_hour;
	@ManyToOne
	private Semester semester;
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Lecturer> lecturers;

}
