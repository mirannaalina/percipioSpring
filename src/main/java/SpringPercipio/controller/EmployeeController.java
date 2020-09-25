package SpringPercipio.controller;

import SpringPercipio.entity.Employee;
import SpringPercipio.entity.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public Iterable<Employee> getEmployee(@RequestParam Long id){
        return employeeRepository.findAll();
    }
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee emp){
        //emp = employeeRepository.save(emp);
        return emp;
    }
}
