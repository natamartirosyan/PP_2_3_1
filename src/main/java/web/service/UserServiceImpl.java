package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAOImpl;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAOImpl userDAO;
    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public User findUser(int id) {
        return userDAO.findUser(id);
    }

    @Override
    @Transactional
    public void editUserById(User user) {
        userDAO.editUserById(user);
    }

    @Override
    @Transactional
    public void removeUserById(int id) {
        userDAO.removeUserById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
