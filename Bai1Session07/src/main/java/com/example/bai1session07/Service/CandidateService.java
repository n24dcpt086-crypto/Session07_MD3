package com.example.bai1session07.Service;

import com.example.bai1session07.Candidate;
import com.example.bai1session07.Repository.CandidateRepository;
import com.example.bai1session07.dto.CandidateCreateDTO;
import org.springframework.stereotype.Service;

@Service

public class CandidateService {
    private final CandidateRepository candidateRepository;
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }
    public Candidate createCandidate(CandidateCreateDTO dto) {
        Candidate candidate = new Candidate();
        candidate.setFuillName(dto.getFullName());
        candidate.setEmail(dto.getEmail());
        candidate.setAge(dto.getAge());
        candidate.setYearsOfExperience(dto.getYearsOfExperience());
        return candidateRepository.save(candidate);
    }
}
