package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.Repository.JpaRepository;
import com.example.demo.entity.StudentEntity;
@Repository
public interface Studentrepository extends JpaRepository<StudentEntity,Integer>{

}