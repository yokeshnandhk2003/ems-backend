package code.logic.tamil.ems_backend.service;

import code.logic.tamil.ems_backend.dto.EmployeeDto;
import code.logic.tamil.ems_backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeebyId(Long employeeId);

    List<EmployeeDto>getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
