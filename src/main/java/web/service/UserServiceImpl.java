package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public User findUser(int id) {
        return userDAO.findUser(id);
    }

    @Override
    public void editUserById(User user) {
        userDAO.editUserById(user);
    }

    @Override
    public void removeUserById(int id) {
        userDAO.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
