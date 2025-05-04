package com.brinta.tutumridez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brinta.tutumridez.entity.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Long> {

}
