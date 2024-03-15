package com.bulahub.actionsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//a change to trigger build

@Controller
public class HomeController {
    @RequestMapping("/home")
    public @ResponseBody String getHome() {
        System.out.println("change to run a build");
        return "Hello World!";
    }

}



