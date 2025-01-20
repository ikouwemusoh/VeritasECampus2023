package com.usoh.VeritasECampus2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.VeritasECampus2023.model.NonAcademicBody;

@Repository
public interface NonAcademicBodyRepo extends JpaRepository<NonAcademicBody, Long> {

}
