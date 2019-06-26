package reflection.db;

import reflection.lib.Dao;
import reflection.model.User;

import java.util.ArrayList;
import java.util.List;

@Dao
public class DataBaseUsers {
    public static final List<User> userDB = new ArrayList<>();
}
