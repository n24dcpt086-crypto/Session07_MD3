package com.example.bai2session07.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CandidateCreateDTO {
    @NotBlank(message = "Tên không được để trống!")
    @Size(min =5, max = 50, message ="Tên phải từ 5 đến 50 kí tự!")
    private String fullName;
    @NotBlank(message ="Email không được để trôngs!")
    @Email(message ="Email không đúng định dạng!")
    private String email;
    @NotBlank(message ="Tuổi không được để trống!")
    @Min(value = 18, message ="Ứng viên phải đủ 18 tuổi trở lên!")
    private Integer age;
    @NotBlank(message ="Năm kinh nghiệm không được để trống!")
    @Min(value= 0, message = "Năm kinh nghiệm không đươcj âm!")
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
