package com.rateNUS.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rateNUS.backend.util.Config;

/**
 * Serves as the API layer for User.
 */
@RestController
@RequestMapping(path = "user")
@CrossOrigin(Config.frontendURL)
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "name/{userId}")
    public String getUserName(@PathVariable("userId") long userId) {
        User user = userService.findById(userId);
        return user.getUsername();
    }
}
