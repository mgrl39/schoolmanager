package com.github.mgrl39.schoolmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.Exception;

@RestControllerAdvice
public class GlobalErrorHandler {
  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handleAllErrors(Exception ex)  {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse("Error :C", ex.getMessage()));
  }
}