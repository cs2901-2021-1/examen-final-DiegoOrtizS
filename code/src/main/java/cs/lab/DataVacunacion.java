package cs.lab;

import java.util.HashMap;

// singleton porque solo puede existir un DataVacunacion
public class DataVacunacion {
    private HashMap<String, Integer> vacunadosPorEdad;
    private int total;
    private static DataVacunacion instance = null;

    public static DataVacunacion getInstance()
    {
        if (instance == null)
            instance = new DataVacunacion();
        return instance;
    }

    private DataVacunacion() {
        vacunadosPorEdad = new HashMap<>();
        vacunadosPorEdad.put("18 a 39", 6303670+5031117);
        vacunadosPorEdad.put("40 a 49", 4183174);
        vacunadosPorEdad.put("50 a 59", 3277134);
        vacunadosPorEdad.put("60 a 69", 2221241);
        vacunadosPorEdad.put("70 a 79", 1271842);
        vacunadosPorEdad.put("80 a mas", 647355);
        total = 0;
        for (Integer value : vacunadosPorEdad.values()) {
            total += value;
        }
    }

    public Double getPorcentaje(String rangoDeEdad) {
        if (!vacunadosPorEdad.containsKey(rangoDeEdad)) return -1.0;
        return Math.round(100.0*100.0*vacunadosPorEdad.get(rangoDeEdad)/total)/100.0;
    }
}