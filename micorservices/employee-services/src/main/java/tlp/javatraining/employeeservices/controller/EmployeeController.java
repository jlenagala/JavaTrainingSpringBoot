package tlp.javatraining.employeeservices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tlp.javatraining.employeeservices.model.Employee;

@RestController
@RequestMapping("/services")
public class EmployeeController {
	@RequestMapping("/hello")
	public String greeting() {
		return "hello world";
		
	}
	@RequestMapping("/employee")
	public List<Employee> getEmployees() {
		return Employee.getAllEmployees();
		
		
	}
	
	

}
