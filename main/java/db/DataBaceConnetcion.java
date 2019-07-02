package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBaceConnetcion {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("test");

    public static EntityManagerFactory getConnection() {
        return FACTORY;
    }
}
