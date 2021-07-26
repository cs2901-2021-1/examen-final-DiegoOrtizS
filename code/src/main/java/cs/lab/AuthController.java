package cs.lab;

import java.util.ArrayList;
import java.util.List;

// singleton porque solo puede existir un AuthController
public class AuthController {
    private List<String> activeUsers;
    private static AuthController instance = null;

    public static AuthController getInstance()
    {
        if (instance == null)
            instance = new AuthController();
        return instance;
    }

    private AuthController() {
        activeUsers = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        if (activeUsers.contains(username)) return false;
        StringBuilder passwordAux = new StringBuilder();
        passwordAux.append(password);
        activeUsers.add(username);
        return username.equals(passwordAux.reverse().toString());
    }

    public boolean logout(String username) {
        return activeUsers.remove(username);
    }
}