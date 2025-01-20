package com.usoh.VeritasECampus2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.VeritasECampus2023.model.Faculty;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Long> {

}
