package org.example.Api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/test")
    public String testApi() {
        return "hello";
    }

    public void test(){
        test1234();

    }

    public void test1234() {

    }

    public void test12345() {

        int a = 0;
        int b = 0;
    }


}
