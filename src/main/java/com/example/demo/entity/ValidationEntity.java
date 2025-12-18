package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
//  springbootstartervalidation
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue=(strategy=GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min=2,max=7, message="Must Be 2 to 10 Characters")
private String userName;
private String email;
private String password;
private int Age;

public ValidationEntity(){}
 
}