package cs.lab;

import java.util.HashMap;

// singleton
public class CentroVacunacionManager {
    private static CentroVacunacionManager instance = null;
    HashMap<Integer, CentroVacunacion> centrosDeVacunacion;
    private float poblacion;
    private int idCont;
    private int contVacunasParciales;
    private int contVacunasCompletas;

    public static CentroVacunacionManager getInstance()
    {
        if (instance == null)
            instance = new CentroVacunacionManager();
        return instance;
    }

    private CentroVacunacionManager() {
        centrosDeVacunacion = new HashMap<>();
        poblacion = 32.51f*1000000;
        idCont = 1;
        contVacunasParciales = 0;
        contVacunasCompletas = 0;
    }

    public void addNuevoCentro(int vacunasParciales, int vacunasCompletas) {
        if (getCont() < 50)
            centrosDeVacunacion.put(idCont++, new CentroVacunacion(vacunasParciales, vacunasCompletas));
    }

    public CentroVacunacion getCentroById(int id) {
        if (!centrosDeVacunacion.containsKey(id)) return null;
        return centrosDeVacunacion.get(id);
    }

    public int getCont() {
        return idCont-1;
    }

    public void aumentarVacunasParciales(int nuevos) {
        contVacunasParciales += nuevos;
    }

    public void aumentarVacunasCompletas(int nuevos) {
        contVacunasCompletas += nuevos;
    }

    public int getVacunasParciales() {
        return contVacunasParciales;
    }

    public int getVacunasCompletas() {
        return contVacunasCompletas;
    }


    public float getAvance() {
        float aux = 100.0f*(getVacunasCompletas()+getVacunasParciales())/poblacion;
        return Math.round(100.0f*aux)/100.0f;
    }

    public float getCobertura() {
        return Math.round(100.0f*100.0f*getVacunasCompletas()/poblacion)/100.0f;
    }
}
