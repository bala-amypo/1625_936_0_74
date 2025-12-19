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
@PrePersist
public void Oncreate(){
LocalDateTime now = LocalDateTime().now();
this.createdat = now;
this.updatedat = now;
}

}
