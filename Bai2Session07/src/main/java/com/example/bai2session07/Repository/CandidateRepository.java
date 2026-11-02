package com.example.bai2session07.Repository;

import com.example.bai2session07.Entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
