package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.Repository.JpaRepository;
@Repository
public Interface Studentrepository extends JpaRepository<StudentEntity,Integer>{

}