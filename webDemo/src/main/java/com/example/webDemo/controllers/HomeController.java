package com.example.webDemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(){
        return "<h1>Hello  World!</h1> <p>We hope you are having a  great day </p>";
    }
}
