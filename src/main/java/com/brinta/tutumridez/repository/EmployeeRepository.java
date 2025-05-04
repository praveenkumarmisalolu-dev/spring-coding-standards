package com.brinta.tutumridez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brinta.tutumridez.entity.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
