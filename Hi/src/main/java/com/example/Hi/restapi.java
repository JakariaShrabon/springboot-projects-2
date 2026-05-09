package com.example.Hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This belongs ABOVE the class
public class restapi { // No semicolon here!

 @GetMapping("/hello") // This belongs INSIDE the curly braces
 public String sayHello() {
  return "Hello World";
 }
}