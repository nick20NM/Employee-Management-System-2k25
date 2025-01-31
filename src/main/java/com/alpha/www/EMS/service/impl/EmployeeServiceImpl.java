package com.alpha.www.EMS.service.impl;

import org.springframework.stereotype.Service;

import com.alpha.www.EMS.dto.EmployeeDto;
import com.alpha.www.EMS.entity.Employee;
import com.alpha.www.EMS.mapper.EmployeeMapper;
import com.alpha.www.EMS.repository.EmployeeRepository;
import com.alpha.www.EMS.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}
