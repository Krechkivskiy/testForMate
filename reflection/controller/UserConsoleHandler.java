package reflection.controller;

import reflection.dao.UserDAO;
import reflection.lib.Inject;
import reflection.model.User;

import java.util.Scanner;

public class UserConsoleHandler {
    @Inject
    static UserDAO userDAO;

    public static void handdle() {
        Scanner scanner = new Scanner(System.in);
        while (true)
            try {
                String[] data = scanner.nextLine().split(" ");
                if (data[0].equals("end")) {
                    for (User user : userDAO.getAll()) {
                        System.out.println(user);
                    }
                } else {
                    int id = Integer.parseInt(data[0]);
                    String nameOfUser = data[1];
                    User user = new User(id, nameOfUser);
                    userDAO.add(user);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}

