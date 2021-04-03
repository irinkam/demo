package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.SecurityService;
import com.example.demo.service.UsersService;
import com.example.demo.validator.UserValidator;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/users")
    public String viewUsersPage(Model model) {
        model.addAttribute("listOfUsers", usersService.getAllUsers());
        return "users";
    }

    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model) {
        Users user = new Users();
        model.addAttribute("user", user);
        return "new_user";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") Users user) {
        usersService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/error")
    public String viewErrorPage()
    {
        return "error";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model){
        Users user = usersService.getUserById(id);
        model.addAttribute("user", user);
        return "update_user";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable (value = "id") long id){
        this.usersService.deleteUser(id);
        return "redirect:/users";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("userForm", new Users());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") Users userForm, BindingResult bindingResult, Model model){
        userValidator.validate(userForm, bindingResult);

        if(bindingResult.hasErrors()){
            return "registration";
        }

        usersService.saveUser(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error){
        if (error != null){
            model.addAttribute("error", "Username or password is incorrect");
        }
        return "login";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Model model){
        return "index";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String admin(Model model){
        return "users";
    }
}
