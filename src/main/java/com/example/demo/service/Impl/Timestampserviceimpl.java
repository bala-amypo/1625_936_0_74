package com.example.demo.service.Impl;
import com.example.demo.service.Timestampservice;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Timestamprepository;
import com.example.demo.entity.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Timestampserviceimpl implements Timestampservice{
@Autowired Timestamprepository student;
                    @Override
                    public Timestamp posttime(Timestamp stu){
                        return student.save(stu);
                 

                        }  