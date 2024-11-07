package com.mrtnbrk.buala_bus_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @RequestMapping("/")
   public String home() {
      return "Buala Bus!";
   }
}
