package com.example.MyApp6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello Coders!!!";
    }

    //https://www.google.com/search?q=sachin
    //localhost:8080/convert_to_INR?q=6
    @GetMapping("/convert_to_INR")
    public String convert(@RequestParam int q){
        int usd=q;
        int inr=usd*75;
        return String.valueOf(inr);
    }

    //localhost:8080/convert?usd=10
    @GetMapping("/convert")
    public int convertusd(@RequestParam int usd){
        return usd*75;
    }


}
