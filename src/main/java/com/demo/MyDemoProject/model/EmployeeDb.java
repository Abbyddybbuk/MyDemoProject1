package com.demo.MyDemoProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Employee", uniqueConstraints = { @UniqueConstraint(columnNames = {"EMPNUM"})})
@Getter
@Setter
@NoArgsConstructor
public class EmployeeDb implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, name = "EMPID")
    private String eId;

    @Column(nullable = false, name = "EMPNUM")
    private String empNum;

    @Column(nullable = false, name = "EMPFIRSTNAME")
    private String empFirstName;

    @Column(nullable = false, name = "EMPLASTNAME")
    private String empLastName;

    @Column(nullable = false, name = "EMPAGE")
    private Integer empAge;

    @Column(name = "EMPDOB")
    private Date dob;

    @Column(name = "SALARY")
    private Double salary;

    @Column(name = "DESIGNATION")
    private String Designation;

    @Column(name = "DEPARTMENT")
    private String department;
}
