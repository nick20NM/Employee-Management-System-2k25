package com.alpha.www.EMS.mapper;

import com.alpha.www.EMS.dto.EmployeeDto;
import com.alpha.www.EMS.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(
				employee.getId(), 
				employee.getFirstName(), 
				employee.getLastName(), 
				employee.getEmail()
				);
	}
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(
				employeeDto.getId(), 
				employeeDto.getFirstName(), 
				employeeDto.getLastName(), 
				employeeDto.getEmail()
				);
	}
}
