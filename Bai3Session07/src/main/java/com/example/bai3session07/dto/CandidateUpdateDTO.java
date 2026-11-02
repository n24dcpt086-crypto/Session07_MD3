package com.example.bai3session07.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CandidateUpdateDTO {
    @NotBlank(message ="Địa chỉ khong được để trống!")
    private String address;
    @Size(max = 200, message = "Giới thiệu bản thân không vượt quá 200 từ!")
    private String bio;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
