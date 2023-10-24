package com.shivraj.spring.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shivraj.spring.model.User;
import com.shivraj.spring.service.UserService;

/**
 * @author imssbora
 */
@Controller
public class UserController {

   @Autowired
   private UserService userService;

   @GetMapping("/")
   public String userForm(Locale locale, Model model) {

      model.addAttribute("user", new User());
      model.addAttribute("users", userService.list());

      return "userForm";
   }

   @PostMapping("/saveUser")
   public String saveUser(@ModelAttribute("user") @Valid User user,
         BindingResult result, Model model) {

      if (result.hasErrors()) {
         
         model.addAttribute("users", userService.list());
         return "userForm";
      }

      userService.save(user);

      return "redirect:/";
   }
}


/*
 * @Pathvariable to read url value
 * 
 * @RequestParam to read query parameter :: It is used to read form data as well
 * 
 * @ModelAttribute - It put request data into the model object
 * 
 * http://testwebaddress.com/getInformation.do?city=Sydney&country=Australia
 * 
 * public String getCountryFactors(@RequestParam(value = "city") String city,  * 
 * @RequestParam(value = "country") String country){ }
 * 
 * 
 * @RequestBody for Post request to convert json to javaObject public String
 * 
 * getCountryFactors(@RequestBody Country countryFacts) {
 * countryFacts.getCity(); countryFacts.getCountry(); }
 */