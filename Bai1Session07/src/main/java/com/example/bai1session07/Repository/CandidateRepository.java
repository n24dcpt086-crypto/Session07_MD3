package com.example.bai1session07.Repository;

import com.example.bai1session07.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}