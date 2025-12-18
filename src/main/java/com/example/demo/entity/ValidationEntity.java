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
@Email(message="Email is not Valid")
private String email;
@NotNull(message="Password is mandatory")
@Size(min=2,max=10,message="Password must be 2 to 10 characters")
private String password;
@Positive(message="Age must be positive")
@Max(30)
private int age;
public ValidationEntity(){}
public ValidationEntity(Long id,
@NotNull @Size(min=2,max=7, message="Must Be 2 to 7 Characters") String userName,
@Email(message="Email is not Valid") String email,
@NotNull(message="Password is mandatory") @Size(min=2,max=10,message="Password must be 2 to 10 characters")String password,
@Positive(message="Age must be positive") @Max(30)int age
){
this.id = id;
this.userName = userName;
this.email = email;
this.password=password;
this.age = age;
}
public String getUserName(){
    return name;
}
public String getEmail(){
    return email;
}
public String getPassword(){
    return password;
}
public int getAge(){
return age;
}
public Long getId(){
    return id;
}
public void setUserName(String userName){
    this.userName= userName;
}
public void setEmail(String email){
    this.email=email;
}
public void setPassword(String password){
    this.password = password;
}
public void setId(Long id){
    this.id = id;
}
public void setAge(int age){
    this.age = age;
}

}

