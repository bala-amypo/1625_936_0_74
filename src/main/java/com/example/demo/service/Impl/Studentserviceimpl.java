package com.example.demo.service.Impl;
import com.example.demo.service.Studentservice;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Studentrepository;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice{
@Autowired Studentrepository student;
//findAll()
//findById()
    //deleteById()
        //findAllById()
            //save()
                //existsById()
                    @Override
                    public StudentEntity postdata(StudentEntity stu){
                        return student.save(stu);
                        }
                    @Override
                        public List<StudentEntity>getAllData(){
                            return student.findAll();
                        }
                        @Override
                        public String DeleteData( int id){
                               student.deleteById(id);
                               return "Deleted Successfully";
                        }
                        @Override
                        public StudentEntity getData(int id){
                               return student.findById(id).orElse(null);
                        }
                        @Override
                        public StudentEntity updateData(int id,StudentEntity entity){
                                         if(student.existsById(id)){
                                            
                                         }        
                        }

                        }  