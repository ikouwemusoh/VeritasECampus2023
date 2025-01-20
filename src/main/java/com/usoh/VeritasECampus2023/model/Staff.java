package com.usoh.VeritasECampus2023.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Staff extends User{
	
	@ManyToMany
	private Set<WorkUnit> workunits;
	
	@ManyToMany
	private Set<Role> roles;
	
	private String userId;
	public Staff() {
		this.setUser_type("staff");
	}
	

}
