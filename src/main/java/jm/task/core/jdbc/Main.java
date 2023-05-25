package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {

    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Leonardo", "NinjaTurtle", (byte) 14);
        userService.saveUser("Donatello", "NinjaTurtle", (byte) 14);
        userService.saveUser("Raphael", "NinjaTurtle", (byte) 15);
        userService.saveUser("Michelangelo", "NinjaTurtle", (byte) 13);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
