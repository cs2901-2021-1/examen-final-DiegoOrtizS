package cs.lab;

import java.util.HashMap;

// singleton porque solo puede existir un DataVacunacion
public class DataVacunacion {
    private HashMap<String, Integer> faltanVacunarPorEdad;
    private int total;
    private static DataVacunacion instance = null;

    public static DataVacunacion getInstance()
    {
        if (instance == null)
            instance = new DataVacunacion();
        return instance;
    }

    private DataVacunacion() {
        faltanVacunarPorEdad = new HashMap<>();
        faltanVacunarPorEdad.put("18 a 39", 6303670+5031117);
        faltanVacunarPorEdad.put("40 a 49", 4183174);
        faltanVacunarPorEdad.put("50 a 59", 3277134);
        faltanVacunarPorEdad.put("60 a 69", 2221241);
        faltanVacunarPorEdad.put("70 a 79", 1271842);
        faltanVacunarPorEdad.put("80 a mas", 647355);
        total = 0;
        for (Integer value : faltanVacunarPorEdad.values()) {
            total += value;
        }
    }

    public float getPorcentaje(String rangoDeEdad) {
        if (!faltanVacunarPorEdad.containsKey(rangoDeEdad)) return -1.0f;
        return Math.round(100.0f*100.0f*faltanVacunarPorEdad.get(rangoDeEdad)/total)/100.0f;
    }
}