package com.java.cis.controller;

import com.java.cis.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class BMIController {

    @RequestMapping(value = "/user/bmi", method = RequestMethod.POST)
    public String calculateBMI(@Validated User user, Model model, HttpSession httpSession) {
        System.out.println("BMI calculator");
        User user1 = (User) httpSession.getAttribute("user");

        if(user1 != null) {
            if(user.getHeight() < 80 && user.getWeight() < 400) {
                double bmiCalculator = (double) Math.round((user.getWeight() / (user.getHeight() * user.getHeight()) * 703) * 100) / 100;
                model.addAttribute("bmiCalculator", bmiCalculator);
                model.addAttribute("userName", user1.getUserName());
            }
            else{
                model.addAttribute("userName", user1.getUserName());
                model.addAttribute("errorMessage", "Check the inputs you have given!!!");
            }
        }

        return "user";
    }
}
