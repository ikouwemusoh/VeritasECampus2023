package com.usoh.VeritasECampus2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.VeritasECampus2023.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long>{

}
