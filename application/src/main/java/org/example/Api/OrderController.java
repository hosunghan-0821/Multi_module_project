package org.example.Api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/test")
    public String testApi(){
        return "hello";
    }

    public void test(){

    }
}
