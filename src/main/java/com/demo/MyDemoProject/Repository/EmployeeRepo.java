package com.demo.MyDemoProject.Repository;

import com.demo.MyDemoProject.model.EmployeeDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeDb,String> {
    Optional<List<EmployeeDb>> findByEmpNum(String empNum);


}
