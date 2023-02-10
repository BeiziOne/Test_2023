package com.example.demo.conteoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping("/HelloWord")
    public String Hello(){
        return "HelloWord";
    }
}
