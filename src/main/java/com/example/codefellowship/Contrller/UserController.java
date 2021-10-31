package com.example.codefellowship.Contrller;

import com.example.codefellowship.Model.ApplicationUser;
import com.example.codefellowship.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UserRepo userRepo;



    @GetMapping("/signup")
    public String getSignUpPage(){
        return "SignUp";
    }

    @PostMapping("/signup")
    public RedirectView signUpUser(@RequestParam String username, @RequestParam String password, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String dateOfBirth, @RequestParam String bio){
       ApplicationUser user=new ApplicationUser(username,encoder.encode(password),firstName,lastName,dateOfBirth,bio);
        userRepo.save(user);
        return new RedirectView("/login");
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
    @GetMapping("/")
    public String getHomePge(){
        return"root";
    }

}
