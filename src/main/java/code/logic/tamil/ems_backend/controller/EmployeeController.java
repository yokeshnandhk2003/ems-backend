package code.logic.tamil.ems_backend.controller;

import code.logic.tamil.ems_backend.dto.EmployeeDto;
import code.logic.tamil.ems_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.AllArgsConstructor;
@CrossOrigin("*")
@RestController

@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    //build add employee rest api
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee (@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    //build get employee rest api
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeId(@PathVariable("id")Long employeeId){
    EmployeeDto employeeDto =employeeService.getEmployeebyId(employeeId);
    return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }
   //build getAll employees rest api
    @GetMapping
    public ResponseEntity<List <EmployeeDto>> getAllEmployees(){
        List<EmployeeDto>employees=employeeService.getAllEmployees();
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    //build update employees rest api
   @PutMapping("{id}")
    public ResponseEntity<EmployeeDto>updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto=employeeService.updateEmployee(employeeId,updatedEmployee);
        return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }

   //build delete employees rest api
   @DeleteMapping("{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return  ResponseEntity.ok("Employee deleted sucessfully");
   }


}
