package com.example.codefellowship.Contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class root {
    @GetMapping("/")
    public String getToRoot(){
        return "root";
    }

}
