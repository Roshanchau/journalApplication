package com.example.journalApplication.Controller;

import com.example.journalApplication.entity.User;
import com.example.journalApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicUserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        userService.saveNewEntry(user);
    }

    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }
}
