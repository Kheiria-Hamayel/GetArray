package com.example.getarray.resource;

import com.example.getarray.model.Employee;
import com.example.getarray.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping(path = "/api/employee")
public class EmployeeResource {

    private final EmployeeService employeeService;

    public EmployeeResource(@Qualifier(value = "employeeDB") EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
        public ResponseEntity<List<Employee>> getEmployees () {
            return  ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployee (@PathVariable("id") Integer id) {
        return  ResponseEntity.ok(employeeService.findEmployeeById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee (@RequestBody Employee employee) {
        //employee.setId(employeeService.getAllEmployees().size() + 1 );
        return  ResponseEntity.created(getLocation(employee.getId())).body(employeeService.addEmployee(employee));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteEmployee (@PathVariable("id") Integer id) {

        return  ResponseEntity.ok(employeeService.deleteById(id));
    }

    protected static URI getLocation(Integer id) {
    return ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(id).toUri();
    }
}
