package com.example.bai3session07.Controller;

import com.example.bai3session07.Entity.Candidate;
import com.example.bai3session07.Service.CandidateService;
import com.example.bai3session07.dto.CandidateCreateDTO;
import com.example.bai3session07.dto.CandidateUpdateDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private final CandidateService candidateService;
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
    @PostMapping
    public ResponseEntity<Candidate> createCandidate(
            @Valid @RequestBody CandidateCreateDTO dto) {
        Candidate candidate = candidateService.createCandidate(dto);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Candidate> updateCandidate(
            @PathVariable Integer id,
            @Valid  @ModelAttribute CandidateUpdateDTO dto) {
        Candidate candidate = candidateService.updateCandidate(id, dto);
        return ResponseEntity.ok(candidate);
    }
}
