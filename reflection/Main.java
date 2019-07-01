package reflection;

import reflection.controller.UserConsoleHandler;
import reflection.lib.Injector;

public class Main {
    public static void main(String[] args) {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("please enter across whitespace users id and users name");
        UserConsoleHandler.handdle();
    }
}
