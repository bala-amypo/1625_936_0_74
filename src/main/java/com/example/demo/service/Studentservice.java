package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.StudentEntity;
public interface Studentservice{
StudentEntity postdata(StudentEntity entity);
List<StudentEntity>getAllData();
String DeleteData(int id);
StudentEntity getData(int id);
StudentEntity putData(int id);
}


