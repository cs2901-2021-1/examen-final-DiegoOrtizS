package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class CentroVacunacion {
    private boolean baja;
    private List<String> personasVacunadas;
    private String distrito;

    public CentroVacunacion(String distrito) {
        baja = false;
        personasVacunadas = new ArrayList<>();
        this.distrito = distrito;
    }

    public void darDeBaja() {
        baja = true;
    }

    public void darDeAlta() {
        baja = false;
    }
}