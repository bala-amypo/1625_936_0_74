package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.Studentservice;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
public class Studentcontroller{
@Autowired Studentservice service;
@PostMapping("/post")
public StudentEntity postval(@RequestBody StudentEntity entity){
    return service.postdata(entity);
}
@GetMapping("/get")
public List<StudentEntity> getval(){
    return service.getAllData();
}
@DeleteMapping("/delete/{id}")
public String deleteval(@PathVariable int id){
    return service.DeleteData(id);
}

}