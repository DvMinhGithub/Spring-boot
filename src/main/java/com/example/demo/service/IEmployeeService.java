package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface IEmployeeService {

    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees ();

    public Employee getEmployee(Long id);

    public boolean deleteEmployee(Long id);

    public Employee updateEmployee(Long id, Employee employee);
}
