package bsuir.controller;

import bsuir.model.UserEntity;
import bsuir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    private UserService userService;

    @RequestMapping("/users")
    public List<UserEntity> getUsers() {
        return userService.getAllForwarders();
    }

    @RequestMapping(value = "/users/status")
    public void changeStatus(@RequestBody UserEntity user) {
        userService.changeStatus(user);
    }

    @RequestMapping(value = "/users/save-user")
    public boolean saveUser(@RequestBody UserEntity user) {
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/users/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/users/get/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/users/edit-user")
    public void editUser(@RequestBody UserEntity user) {
        userService.editUser(user);
    }

    @RequestMapping(value = "/users/authorization")
    public UserEntity authorizationUser(@RequestBody UserEntity user) {
        UserEntity data = userService.authorizationUser(user);
        return data;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
