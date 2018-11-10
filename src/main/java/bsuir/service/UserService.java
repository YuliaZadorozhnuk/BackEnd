package bsuir.service;

import bsuir.model.UserEntity;

import java.util.List;

public interface UserService {
    void deleteUser(Long id);
    UserEntity getUserById(Long id);
    void editUser(UserEntity user);
    void changeStatus(UserEntity user);
    List<UserEntity> getAllForwarders();
    boolean saveUser(UserEntity user);
    UserEntity authorizationUser(UserEntity user);
    boolean isLoginExist(String login);
}
