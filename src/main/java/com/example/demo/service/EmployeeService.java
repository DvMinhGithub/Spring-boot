package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null) {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        if (id != null) {
            return employeeRepository.getReferenceById(id);
        }
        return null;
    }

    @SuppressWarnings({ "unused", "null" })
    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employeeToUpdate = employeeRepository.getReferenceById(id);
        if (employeeToUpdate != null) {
            employeeToUpdate.setName(employee.getName());
            employeeToUpdate.setAddress(employee.getAddress());
            return employeeRepository.save(employeeToUpdate);
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if (id != null) {
            Employee employee = employeeRepository.getReferenceById(id);
            if (employee != null) {
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }
}
