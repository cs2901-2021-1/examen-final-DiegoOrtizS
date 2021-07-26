package cs.lab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest 
{    
    // @Test
    // public void test1() throws IOException
    // {
    //     Usuario user = new Usuario();
    //     user.setNombre("hola");
    //     Assert.assertEquals(user.getNombre(), "hola");

    //     List<Usuario> users = new ArrayList<>();
    //     users.add(0, user);
    //     Assert.assertFalse(Skyalert.getInstance().setUsuarios(users));
    //     Assert.assertTrue(Skyalert.getInstance().getUsuarios().size() != 1);
    //     users.add(1, user);
    //     users.add(2, user);
    //     users.add(3, user);
    //     users.add(4, user);
    //     Assert.assertTrue(Skyalert.getInstance().setUsuarios(users));
    // }

    // @Test
    // public void test2() throws IOException
    // {
    //     Vuelo vuelo = new Vuelo();
    //     vuelo.setPartida("Perú");
    //     vuelo.setDestino("USA");
    //     vuelo.setPrecio(1400.0);
    //     vuelo.setDuracion(5.0);
    //     Assert.assertEquals(vuelo.getPartida(), "Perú");
    //     Assert.assertEquals(vuelo.getDestino(), "USA");
    //     Assert.assertTrue(vuelo.getPrecio() == 1400.0); 
    //     Assert.assertTrue(vuelo.getDuracion() == 5.0); 

    //     Airline airline = new Airline();
    //     List<Vuelo> vuelos = new ArrayList<>();
    //     vuelos.add(0, vuelo);
    //     airline.setVuelos(vuelos);        
    //     Assert.assertTrue(airline.getVuelos().size() == 1);

    //     List<Airline> airlinesList = new ArrayList<>();
    //     airlinesList.add(0, airline);
    //     Assert.assertFalse(Skyalert.getInstance().setAirlinesList(airlinesList));
    //     airlinesList.add(1, airline);
    //     airlinesList.add(2, airline);
    //     Assert.assertTrue(Skyalert.getInstance().setAirlinesList(airlinesList));
    // }

    // @Test
    // public void test3() throws IOException
    // {
    //     Assert.assertTrue(Skyalert.getInstance().findTarifa("Perú", "USA", 1400.0, 5.0));
    //     Assert.assertFalse(Skyalert.getInstance().findTarifa("Perú", "USA", 1000.0, 5.0));
    //     Assert.assertFalse(Skyalert.getInstance().findTarifa("Brasil", "Perú", 1400.0, 5.0));
    //     Assert.assertFalse(Skyalert.getInstance().findTarifa("Perú", "Brasil", 1400.0, 5.0));
    // }

    // @Test
    // public void test4() throws IOException
    // {
    //     Assert.assertTrue(Skyalert.getInstance().updateTarifa("Perú", "USA", 2000.0));
    //     Assert.assertFalse(Skyalert.getInstance().updateTarifa("Brasil", "Perú", 1400.0));
    //     Assert.assertFalse(Skyalert.getInstance().updateTarifa("Perú", "Brasil", 1400.0));        
    // }
}