package tr.ramazan.yesildag.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tr.ramazan.yesildag.first.entity.User;
import tr.ramazan.yesildag.first.service.IUserService;

import java.util.List;

@RestController
class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String index() {
        return "Selam Rääämbooooo :D";
    }


    @PostMapping(value = "/create-user")
    public User createUser(@ModelAttribute User user) {
        return userService.save(user);
    }

    @GetMapping("/get-all-users")
    public List<User> getAll() {
        return userService.findAll();
    }
}
