package com.brinta.tutumridez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brinta.tutumridez.entity.employee.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
