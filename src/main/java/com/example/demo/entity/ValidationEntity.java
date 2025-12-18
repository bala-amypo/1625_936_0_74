package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//  springbootstartervalidation
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue=(strategy=GenerationType.IDENTITY)
private Long id;
@Notnull
private String userName;
private String email;
private String password;
private int Age;

public ValidationEntity(){}
 
}