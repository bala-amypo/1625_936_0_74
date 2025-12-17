package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.Studentservice;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class Studentcontroller{
@Autowired Studentservice service;
@PostMapping("/post")
public StudentEntity postval(@RequestBody StudentEntity entity){
    return service.postdata(entity);
}

}