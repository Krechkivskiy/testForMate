package reflection.factory;

import reflection.dao.UserDaoImpl;

public class UserDaoFactory {
    private static UserDaoImpl userDao = new UserDaoImpl();

    public static UserDaoImpl getUserDao() {
        return userDao;
    }
}
