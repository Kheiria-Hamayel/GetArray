package com.example.getarray.repository;

import com.example.getarray.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository {
    private static final List<Employee> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Employee(1,"John","Smith","john.smith@gmail.com"));
        DATABASE.add(new Employee(2,"Sarah","Alex","sarah.alex@gmail.com"));
        DATABASE.add(new Employee(3,"Alice","Ray","alice.ray@gmail.com"));
    }

    public Employee addEmployee(Employee employee){
        DATABASE.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees(){
        //return DATABASE.stream().toList();
        return List.copyOf(DATABASE);
    }

    public Employee findEmployeeById(Integer id){
        return DATABASE.stream().filter(emp -> id.equals(emp.getId())).findFirst().orElseThrow();
    }

    public void updateEmployee(Employee employee)
    {

    }

    public boolean deleteById(Integer id){
        Employee employee =  DATABASE.stream().filter(emp -> id.equals(emp.getId())).findFirst().orElseThrow();
        DATABASE.remove(employee);
        return true;
    }
}
