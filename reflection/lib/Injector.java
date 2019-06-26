package reflection.lib;

import reflection.controller.UserConsoleHandler;

import reflection.db.DataBaseUsers;
import reflection.factory.UserDaoFactory;

import java.lang.reflect.Field;

public class Injector {
    public static void injectDependency() throws IllegalAccessException {
        Class<UserConsoleHandler> consoleHandlerClass = UserConsoleHandler.class;
        Field[] declaredFields = consoleHandlerClass.getDeclaredFields();
        for (Field declaredFieldOfIngectorClass : declaredFields) {
            if (declaredFieldOfIngectorClass.getDeclaredAnnotation(Inject.class) != null
                    && DataBaseUsers.class.isAnnotationPresent(Dao.class)) {
                declaredFieldOfIngectorClass.setAccessible(true);
                declaredFieldOfIngectorClass.set(null, UserDaoFactory.getUserDao());
            } else {
                throw new IllegalArgumentException("uncorrect db");
            }
        }
    }
}

