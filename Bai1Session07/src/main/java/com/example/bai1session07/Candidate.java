package com.example.bai1session07;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="candidates")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fuillName;
    private String email;
    private Integer age;
    private Integer yearsOfExperience;
}
