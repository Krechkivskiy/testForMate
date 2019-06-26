package reflection.dao;

import reflection.db.DataBaseUsers;
import reflection.model.User;

import java.util.List;

public class UserDaoImpl implements UserDAO {
    @Override
    public void add(User user) {
        DataBaseUsers.userDB.add(user);
    }

    @Override
    public List<User> getAll() {
        return DataBaseUsers.userDB;
    }
}
