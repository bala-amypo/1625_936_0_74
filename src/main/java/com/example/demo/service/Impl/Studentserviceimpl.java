package com.example.demo.service.Impl;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
@Service
public class Studentserviceimpl implements Studentservice{
@AutoWired Studentrepository student;
//findAll()
//findById()
    //deleteById()
    //findAllById()
    //save()
    //existsById()
public StudentEntity postdata(StudentEntity stu){
    return student.save(stu);
}

}  