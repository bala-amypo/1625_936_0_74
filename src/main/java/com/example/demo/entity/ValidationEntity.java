package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
//  springbootstartervalidation
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue=(strategy=GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min=2,max=7, message="Must Be 2 to 7 Characters")
private String userName;
@Email
private String email;
@Size(min=2,max=10,message="Password must be 2 to 10 characters")
@NotNull(message="Password is mandatory")
private String password;
@Positive(message="Age must be positive")
@Max(30)
private int Age;
public ValidationEntity(){}

}
