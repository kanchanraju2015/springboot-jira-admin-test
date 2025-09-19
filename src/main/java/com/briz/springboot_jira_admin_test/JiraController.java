package com.briz.springboot_jira_admin_test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiraController {
    @RequestMapping("/test")
    public String test() {
        return "This is jira admin test";
    }
}
