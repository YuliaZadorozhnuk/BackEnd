package bsuir.service.serviceImpl;

import bsuir.dao.UserDao;
import bsuir.model.UserEntity;
import bsuir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ClientsService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    @Transactional
    public void editUser(UserEntity user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void changeStatus(UserEntity user) {
        if (user.getStatus() == 1) {
            user.setStatus(0);
        } else {
            user.setStatus(1);
        }
        userDao.save(user);
    }

    @Override
    @Transactional
    public List<UserEntity> getAllForwarders() {
        return userDao.getAllForwarders();
    }

    @Override
    @Transactional
    public boolean saveUser(UserEntity user) {
        boolean isSave = false;
        if(!this.isLoginExist(user.getLogin())) {
            isSave = true;
            if (user.getName() == null) {
                user.setRole(3);
                user.setStatus(1);
                userDao.save(user);
            } else {
                user.setRole(2);
                user.setStatus(1);
                userDao.save(user);
            }
        }
        return isSave;
    }

    @Override
    @Transactional
    public UserEntity authorizationUser(UserEntity user) {
        UserEntity data = userDao.findByLoginAndPassword(user.getLogin(), user.getPassword());
        return data;
    }

    @Override
    @Transactional
    public boolean isLoginExist(String login) {
        UserEntity user = this.userDao.findByLogin(login);
        if(user != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    @Override
    @Transactional
    public UserEntity getUserById(Long id) {
        return userDao.findById(id).get();
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}