package com.github.mgrl39.schoolmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping("/error")
  public String index() {
    return "error";
  }
}
