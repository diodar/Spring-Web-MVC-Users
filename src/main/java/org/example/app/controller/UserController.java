package org.example.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.app.entity.User;
import org.example.app.service.ext.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/users")
    public String viewUsers(Model model) {
        List<User> users = service.fetchAll();
        model.addAttribute("title", "Users");
        model.addAttribute("user", users);
        return "users";
    }

    @RequestMapping("/add-user")
    public String addUser(Model model) {
        model.addAttribute("title", "Add User");
        return "user_add";
    }

    @RequestMapping(value = "/handle-user", method = RequestMethod.POST)
    public RedirectView handleUser(@ModelAttribute User user, HttpServletRequest request) {
        service.save(user);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("./users");
        return redirectView;
    }

    @RequestMapping("/update-user/{id}")
    public String updateUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title","Update User");
        User user = service.fetchById(id);
        model.addAttribute("user", user);
        return "user_update";
    }

    @RequestMapping("/delete-user/{id}")
    public RedirectView deleteUser(@PathVariable("id") Long id, HttpServletRequest request) {
        service.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/users");
        return redirectView;
    }
}