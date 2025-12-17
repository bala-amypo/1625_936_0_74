package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.AutoWired;

import com.example.demo.service.StudentService;
@RestController
public class Studentcontroller{
@AutoWired Studentservice service;

}