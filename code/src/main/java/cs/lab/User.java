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

    public float getPorcentaje(String rangoDeEdad) {
        return DataVacunacion.getInstance().getPorcentaje(rangoDeEdad);
    }

    public void addNuevoCentro(int vacunasParciales, int vacunasCompletas) {
        CentroVacunacionManager.getInstance().addNuevoCentro(vacunasParciales, vacunasCompletas);
    }

    public void darDeBaja(int id) {
        CentroVacunacionManager.getInstance().getCentroById(id).darDeBaja();
    }

    public void darDeAlta(int id) {
        CentroVacunacionManager.getInstance().getCentroById(id).darDeAlta();        
    }
}