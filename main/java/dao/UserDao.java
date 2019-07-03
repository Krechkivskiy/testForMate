package dao;

import model.UserModel;

public interface UserDao {
    boolean checkIsPresent(String login);

    void addUser(UserModel user);
}
