package com.example.demo.entity;

import jakarta.persistence.Entity;
@Entity
public Class StudentEntity{

private String name;
private Integer id;
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
    return name;
}
public String getPassword(String name){
    return name;
}
public Date getCreated(Date created){

}

}