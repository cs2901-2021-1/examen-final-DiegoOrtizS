package cs.lab;

public class User {
    private String username;
    private String password;
    private AuthController auth = new AuthController();
    private DataVacunacion data = new DataVacunacion();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        return auth.login(username, password);
    }

    public boolean logout() {
        return auth.logout(username);
    }

    public Double getPorcentaje(String rangoDeEdad) {
        return data.getPorcentaje(rangoDeEdad);
    }
}