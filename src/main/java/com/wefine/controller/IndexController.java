package com.wefine.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IndexController {

  @GetMapping(value = "/")
  ResponseEntity<String> get() {

    return ResponseEntity.ok("OK");
  }

}
