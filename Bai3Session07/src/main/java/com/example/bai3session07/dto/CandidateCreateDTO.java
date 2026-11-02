package com.example.bai3session07.dto;

import jakarta.validation.constraints.*;

public class CandidateCreateDTO {
    @NotBlank(message = "Họ tên khongo được để trống!")
    @Size(min = 5, max = 50, message = "Họ tên phải từ 5 đến 50 kí tự!")
    private String fullName;
    @NotBlank(message = "Email không được để trống!")
    @Email(message = "Email không đúng định dạng!")
    private String email;
    @NotNull(message = "Tuôir không được để trống!")
    @Min(value = 18, message = "Ứng viên phải trên 18 tuổi!")
    private Integer age;
    @NotNull(message = "Năm kinh nghiệm không được để trống!")
    @Min(value = 0, message = "Năm kinh nghiệm không được âm!")
    @NotNull(message = "Năm kinh nghiệm không được để trống")
    @Min(value = 0, message = "Năm kinh nghiệm không được âm")
    private Integer yearsOfExperience;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
