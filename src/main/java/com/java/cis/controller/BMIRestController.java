package com.java.cis.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIRestController {
    @RequestMapping(value = "/bmirest", method = RequestMethod.POST)
    public String getBMI(@RequestParam("height") double height,
                         @RequestParam("weight") double weight) {
        double bmiCalculator = (double) Math.round((weight / (height * height) * 703) * 100) / 100;
        System.out.println(bmiCalculator);
        return "bmi value is: " + bmiCalculator;
    }
}
