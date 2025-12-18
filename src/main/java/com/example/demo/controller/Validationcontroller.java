package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.Validationservice;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
@RestController
public class Validationcontroller{
@Autowired Validationservice service;
@PostMapping("/post")
public ValidationEntity postval(@Valid @RequestBody ValidationEntity entity){
    return service.postdata(entity);
}


}