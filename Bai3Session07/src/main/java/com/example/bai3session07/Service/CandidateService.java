package com.example.bai3session07.Service;

import com.example.bai3session07.Entity.Candidate;
import com.example.bai3session07.Repository.CandidateRepository;
import com.example.bai3session07.dto.CandidateCreateDTO;
import com.example.bai3session07.dto.CandidateUpdateDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate createCandidate(CandidateCreateDTO dto) {

        Candidate candidate = new Candidate();

        candidate.setFullName(dto.getFullName());
        candidate.setEmail(dto.getEmail());
        candidate.setAge(dto.getAge());
        candidate.setYearsOfExperience(dto.getYearsOfExperience());

        return candidateRepository.save(candidate);
    }
    public Candidate updateCandidate(Integer id, CandidateUpdateDTO dto) {

        Candidate candidate = candidateRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Không tìm thấy ứng viên"
                ));

        candidate.setAddress(dto.getAddress());
        candidate.setBio(dto.getBio());

        return candidateRepository.save(candidate);
    }
}