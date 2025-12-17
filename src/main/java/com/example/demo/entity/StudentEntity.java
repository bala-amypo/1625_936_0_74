package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
@Entity
public Class StudentEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
private String password;
private Date created;
public StudentEntity(){}
public StudentEntity(String name,Integer id,String email,String password,Date created){
    this.name =name;
    this.id = id;
    this.email = email;
    this.password=password;
    this.created = created;
}
public String getName(){
    return name;
}
public String getEmail(){
    return email;
}
public String getPassword(){
    return password;
}
public Date getCreated(){
return created;
}
public Integer getId(){
    return id;
}
public void setName(String name){
    this.name= name;
}
public void setEmail(String email){
    this.email=email;
}
public void setPassword()


}