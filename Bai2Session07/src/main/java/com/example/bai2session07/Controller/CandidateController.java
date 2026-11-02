package com.example.bai2session07.Controller;

import com.example.bai2session07.Entity.Candidate;
import com.example.bai2session07.Service.CandidateService;
import com.example.bai2session07.dto.CandidateCreateDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private final CandidateService candidateService;
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
    @PostMapping
    public ResponseEntity<Candidate> createCandidate(
            @Valid @RequestBody CandidateCreateDTO dto
            ) {
        Candidate candidate = candidateService.createCandidate(dto);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }
}
