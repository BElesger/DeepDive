package com.udemy.SpringBoot.DeepDive;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @Autowired
    private WelcomeService welcomeService;

    @RequestMapping("/welcome")
    public String welcome() {
        return welcomeService.getWelcomeMessage();
    }


}

@Service
class WelcomeService {

    public String getWelcomeMessage() {
        return "Welcome Message !!!";
    }
}