package com.usoh.VeritasECampus2023.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	@OneToMany(mappedBy = "department")
	private List<Student> students;
	@ManyToMany(mappedBy = "departments")
	private Set<Lecturer> lecturers;
	@ManyToOne
	private Faculty faculty;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Set<Lecturer> getLecturers() {
		return lecturers;
	}
	public void setLecturers(Set<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", description=" + description + ", students=" + students
				+ ", lecturers=" + lecturers + ", faculty=" + faculty + "]";
	}
	public Department(long id, String name, String description, List<Student> students, Set<Lecturer> lecturers,
			Faculty faculty) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.students = students;
		this.lecturers = lecturers;
		this.faculty = faculty;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
