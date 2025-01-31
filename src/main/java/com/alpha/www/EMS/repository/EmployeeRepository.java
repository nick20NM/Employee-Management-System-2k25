package com.alpha.www.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.www.EMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
