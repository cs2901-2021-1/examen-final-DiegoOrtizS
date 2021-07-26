package cs.lab;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        return AuthController.getInstance().login(username, password);
    }

    public boolean logout() {
        return AuthController.getInstance().logout(username);
    }

    public Double getPorcentaje(String rangoDeEdad) {
        return DataVacunacion.getInstance().getPorcentaje(rangoDeEdad);
    }
}