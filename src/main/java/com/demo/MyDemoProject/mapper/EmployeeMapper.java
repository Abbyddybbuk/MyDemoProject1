package com.demo.MyDemoProject.mapper;

import com.demo.MyDemoProject.model.EmployeeDb;
import com.demo.MyDemoProject.pojo.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {
    public EmployeeDb mapToEmployeeDb(Employee employee) {
        EmployeeDb employeeDb = new EmployeeDb();
        employeeDb.setEmpNum(employee.getEmpNum());
        employeeDb.setDob(employee.getDob());
        employeeDb.setDepartment(employee.getDepartment());
        employeeDb.setDesignation(employee.getDesignation());
        employeeDb.setEmpAge(employee.getEmpAge());
        employeeDb.setSalary(employee.getSalary());
        employeeDb.setEmpFirstName(employee.getEmpFirstName());
        employeeDb.setEmpLastName(employee.getEmpLastName());
        return employeeDb;
    }

    public Employee mapToEmployee(EmployeeDb employeeDb) {
        Employee employee = new Employee();
        employee.setEmpNum(employeeDb.getEmpNum());
        employee.setDob(employeeDb.getDob());
        employee.setDepartment(employeeDb.getDepartment());
        employee.setDesignation(employeeDb.getDesignation());
        employee.setEmpAge(employeeDb.getEmpAge());
        employee.setSalary(employeeDb.getSalary());
        employee.setEmpFirstName(employeeDb.getEmpFirstName());
        employee.setEmpLastName(employeeDb.getEmpLastName());
        return employee;
    }

    public List<Employee> mapToEmployeeList(List<EmployeeDb> employeeDbList) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList = employeeDbList.stream().map(employeeDb -> this.mapToEmployee(employeeDb)).collect(Collectors.toList());
        return employeeList;
    }
}
