package com.example.bai2session07.Exception;

import com.example.bai2session07.Warpper.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Map<String, String>>> handlerValidationException(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new LinkedHashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {

            String fieldName = error.getField();

            String errorMessage = error.getDefaultMessage();

            errors.putIfAbsent(fieldName, errorMessage);
        });

        ApiResponse<Map<String, String>> response = new ApiResponse<>(
                "ERROR",
                "Dữ liệu đầu vào không hợp lệ",
                errors
        );

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
