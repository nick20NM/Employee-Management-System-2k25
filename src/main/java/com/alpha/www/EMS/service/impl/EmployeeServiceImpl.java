package com.alpha.www.EMS.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

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

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository
				.findById(employeeId)
				.orElseThrow(() -> new ResourceAccessException("Employee not found with id: " + employeeId));
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

}
