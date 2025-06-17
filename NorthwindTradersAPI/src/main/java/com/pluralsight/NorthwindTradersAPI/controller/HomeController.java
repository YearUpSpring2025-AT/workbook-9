package com.pluralsight.NorthwindTradersAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "country") String name){
        return "<h1>Hello "+ name + "</h1> <p> Welcome to our world! </p>";
    }

}
