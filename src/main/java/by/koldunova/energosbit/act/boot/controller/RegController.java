package by.koldunova.energosbit.act.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.koldunova.energosbit.act.boot.entity.User;
import by.koldunova.energosbit.act.boot.service.UserService;

@Controller
public class RegController {
    @Autowired
    UserService userService;
    
    @GetMapping("/reg")
    public String registration(Model model, @RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        
        userService.saveUser(user);
        
        return "redirect:/login";
    }
}
