package com.github.mgrl39.schoolmanager.exception;

// Simple class for the JSON
public class ErrorResponse {
  public String error;
  public String message;

  public ErrorResponse(String error, String message) {
    this.error = error;
    this.message = message;
  }
  
}
