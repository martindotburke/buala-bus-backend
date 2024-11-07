package com.mrtnbrk.buala_bus_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @CrossOrigin
   @RequestMapping("/")
   public String home() {
      return "{ data: 'Buala Bus!' }";
   }
}
