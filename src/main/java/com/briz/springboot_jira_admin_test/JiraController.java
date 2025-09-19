package com.briz.springboot_jira_admin_test;


import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiraController {
    @RequestMapping("/test")
    public String test() {
        return "This is jira admin test";
    }

    @NotBlank(message = "The name cannot be blank")
    @RequestMapping("/userInput")
    public String userInput(@PathVariable String name) {
        return "Hello " + name;
    }
}
