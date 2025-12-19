package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timestamp{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
private LocalDateTime createdat;
private LocalDateTime updatedat;
LocalDateTime now = LocalDateTime.now();
@PrePersist
public void Oncreate(){
this.createdat = now;
this.updatedat = now;
}
@PreUpdate
public void Onupdate(){
this.updatedat = now;
}
