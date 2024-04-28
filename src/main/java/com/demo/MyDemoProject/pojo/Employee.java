package com.demo.MyDemoProject.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Employee implements Serializable {
    private String empNum;

    private String empFirstName;

    private String empLastName;

    private Integer empAge;

    private Date dob;

    private Double salary;

    private String designation;

    private String department;
}
