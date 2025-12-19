package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.Timestampservice;
import com.example.demo.entity.Timestamp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class Timestampcontroller{
@Autowired Timestampservice service;
@PostMapping("/timepost")
public Timestamp posttimed(@Valid @RequestBody Timestamp entity){
    return service.posttime(entity);
}



}