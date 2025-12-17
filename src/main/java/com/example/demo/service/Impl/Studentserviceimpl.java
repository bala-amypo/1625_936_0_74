package com.example.demo.service.Impl;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Studentrepository;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.AutoWired;
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