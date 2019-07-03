package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBaceConnetcion {
    private static final String TEST = "tesr";
    private static EntityManagerFactory factory;

    private DataBaceConnetcion() {
    }

    public static EntityManagerFactory getConnection() {
        if (factory != null) {
            factory = Persistence.createEntityManagerFactory(TEST);
        }
        return factory;
    }
}
