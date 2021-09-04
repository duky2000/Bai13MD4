package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class UserController {
    @ModelAttribute("user")
    public User setUser() {
        return new User("ky", "123");
    }

    @GetMapping("/users")
    public ModelAndView showLogin() {
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }

    @PostMapping("/Login")
    public String login() {
        return "/result";
    }
}
