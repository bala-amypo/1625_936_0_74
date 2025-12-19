
package com.example.demo.service.Impl;
import com.example.demo.service.Validationservice;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Validationrepository;
import com.example.demo.entity.ValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class Validationserviceimpl implements Validationservice{
@Autowired Validationrepository student;
                    @Override
                    public ValidationEntity postdata(ValidationEntity stu){
                        return student.save(stu);
                        }
                         @Override
                        public ValidationEntity getData(int id){
                               return student.findById(id).orElseThrow();
                        }
                        }  