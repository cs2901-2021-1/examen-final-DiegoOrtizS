package cs.lab;

import java.util.HashMap;

// singleton
public class CentroVacunacionManager {
    HashMap<Integer, CentroVacunacion> centrosDeVacunacion;
    private float poblacion = 32.51f*1000000;
    private int idCont = 1;
    private static CentroVacunacionManager instance = null;

    public static CentroVacunacionManager getInstance()
    {
        if (instance == null)
            instance = new CentroVacunacionManager();
        return instance;
    }

    private CentroVacunacionManager() {
        centrosDeVacunacion = new HashMap<>();
    }

    public void addNuevoCentro(String distrito) {
        centrosDeVacunacion.put(idCont++, new CentroVacunacion(distrito));
    }

    public CentroVacunacion getCentroById(int id) {
        if (!centrosDeVacunacion.containsKey(id)) return null;
        return centrosDeVacunacion.get(id);
    }

    public int getCont() {
        return idCont;
    }

    public int getVacunasParciales() {
        int cont = 0;
        for (CentroVacunacion centro : centrosDeVacunacion.values()) {
            if (!centro.getDarBaja()) {
                cont += centro.getVacunasParciales();
            }
        }
        return cont;
    }

    public int getVacunasCompletas() {
        int cont = 0;
        for (CentroVacunacion centro : centrosDeVacunacion.values()) {
            if (!centro.getDarBaja()) {
                cont += centro.getVacunasCompletas();
            }
        }
        return cont;
    }

    public float getAvance() {
        return 100.0f*getVacunasCompletas()/poblacion;
    }

    public float getCobertura() {
        return (100.0f*getVacunasParciales()+getVacunasCompletas())/poblacion;
    }
}
