package cs.lab;

public class CentroVacunacion {
    private boolean baja;
    private int vacunasParciales;
    private int vacunasCompletas;

    public CentroVacunacion(int vacunasParciales, int vacunasCompletas) {
        baja = true;
        this.vacunasParciales = vacunasParciales;
        this.vacunasCompletas = vacunasCompletas;
    }

    public void darDeBaja() {
        baja = true;
    }

    public void darDeAlta() {
        baja = false;
        // notifica al manager
        CentroVacunacionManager.getInstance().aumentarVacunasParciales(vacunasParciales);
        CentroVacunacionManager.getInstance().aumentarVacunasCompletas(vacunasCompletas);
        vacunasParciales = 0;
        vacunasCompletas = 0;
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