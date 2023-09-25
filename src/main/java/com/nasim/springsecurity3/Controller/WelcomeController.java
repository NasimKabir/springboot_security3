package com.nasim.springsecurity3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nasimkabir
 * ২৫/৯/২৩
 */
@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Security";
    }
}
