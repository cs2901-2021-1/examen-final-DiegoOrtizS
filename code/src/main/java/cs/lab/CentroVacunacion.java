package cs.lab;

import java.util.Random;

public class CentroVacunacion {
    private boolean baja;
    private String distrito;
    private int vacunasParciales;
    private int vacunasCompletas;

    public CentroVacunacion(String distrito) {
        Random rand = new Random();
        baja = false;
        this.distrito = distrito;
        vacunasParciales = rand.nextInt(1000);
        vacunasCompletas = rand.nextInt(1000);
    }

    public void darDeBaja() {
        baja = true;
    }

    public void darDeAlta() {
        baja = false;
    }

    public boolean getDarBaja() {
        return baja;
    }

    public int getVacunasParciales() {
        return vacunasParciales;
    }
    
    public int getVacunasCompletas() {
        return vacunasCompletas;
    }
}