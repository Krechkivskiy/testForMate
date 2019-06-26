package reflection.dao;

import reflection.model.User;

import java.util.List;

public interface UserDAO {
    void add(User user);

    List<User> getAll();
}
