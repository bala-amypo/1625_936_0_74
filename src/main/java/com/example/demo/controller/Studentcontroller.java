package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.we.factory.annotation.PostMapping;
import com.example.demo.service.StudentService;
@RestController
public class Studentcontroller{
@Autowired Studentservice service;
@PostMapping("/post")
public StudentEntity postval(@RequestBody StudentEntity entity){
    return service.postdata(entity);
}

}