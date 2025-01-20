package com.usoh.VeritasECampus2023.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class Lecturer extends Staff{
	@ManyToMany
	@JoinTable(
	        name = "lecturer_department",
	        joinColumns = @JoinColumn(name = "lecturer_id"),
	        inverseJoinColumns = @JoinColumn(name = "department_id")
	    )
	private Set<Department> departments;
	
	@ManyToMany
	@JoinTable(
	        name = "lecturer_courses",
	        joinColumns = @JoinColumn(name = "lecturer_id"),
	        inverseJoinColumns = @JoinColumn(name = "course_id")
	    )
	private Set<Course> courses;

}
