package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBaceConnetcion {
    private static final String PERSISTENCE_UNIT_NAME = "test";
    private static EntityManagerFactory factory;

    private DataBaceConnetcion() {
    }

    public static EntityManagerFactory getConnection() {
        if (factory != null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }
}
