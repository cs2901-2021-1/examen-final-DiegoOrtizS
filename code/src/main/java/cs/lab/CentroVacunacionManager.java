package cs.lab;

import java.util.HashMap;

// singleton
public class CentroVacunacionManager {
    HashMap<Integer, CentroVacunacion> centrosDeVacunacion;
    private int idCont = 0;
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
        centrosDeVacunacion.put(idCont, new CentroVacunacion(distrito));
    }

    public CentroVacunacion getCentroById(int id) {
        if (!centrosDeVacunacion.containsKey(id)) return null;
        return centrosDeVacunacion.get(id);
    }
}
