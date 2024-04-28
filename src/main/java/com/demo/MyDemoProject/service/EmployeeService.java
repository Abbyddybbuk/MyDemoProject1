package com.demo.MyDemoProject.service;

import com.demo.MyDemoProject.Repository.EmployeeRepo;
import com.demo.MyDemoProject.mapper.EmployeeMapper;
import com.demo.MyDemoProject.model.EmployeeDb;
import com.demo.MyDemoProject.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepo employeeRepo;

    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo, EmployeeMapper employeeMapper) {
        this.employeeRepo = employeeRepo;
        this.employeeMapper = employeeMapper;
    }

    public Employee createEmployee(Employee employee) {
        employeeRepo.save(this.employeeMapper.mapToEmployeeDb(employee));
        return employee;
    }

    public List<Employee> getEmployee(String eNum) {
        Optional<List<EmployeeDb>> employeeDb = employeeRepo.findByEmpNum(eNum);
        List<EmployeeDb> employeeDbList = employeeDb.get();
        if (!employeeDbList.isEmpty())
            return this.employeeMapper.mapToEmployeeList(employeeDbList);
        return new ArrayList<Employee>();
    }
}
