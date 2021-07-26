package cs.lab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest 
{
    @Test
    public void testLoginIncorrecto() throws IOException
    {
        User user = new User("diego", "o");
        Assert.assertFalse(user.login());
    }

    @Test
    public void testLoginCorrecto() throws IOException
    {
        User user = new User("diego", "ogeid");
        Assert.assertTrue(user.login());
        Assert.assertEquals(user.getPorcentaje("18 a 39"), 49.42f);
        Assert.assertEquals(user.getPorcentaje("40 a 49"), 18.24f);
        Assert.assertEquals(user.getPorcentaje("50 a 59"), 14.29f);
        Assert.assertEquals(user.getPorcentaje("60 a 69"), 9.68f);
        Assert.assertEquals(user.getPorcentaje("70 a 79"), 5.55f);
        Assert.assertEquals(user.getPorcentaje("80 a mas"), 2.82f);
        Assert.assertEquals(user.getPorcentaje("F"), -1.0f);

        user.addNuevoCentro(10000, 20000);
        user.darDeBaja(1);
        Assert.assertTrue(CentroVacunacionManager.getInstance().getCentroById(1).getDarBaja());
        user.darDeAlta(1);
        Assert.assertFalse(CentroVacunacionManager.getInstance().getCentroById(1).getDarBaja());
        Assert.assertNull(CentroVacunacionManager.getInstance().getCentroById(0));
        Assert.assertEquals(CentroVacunacionManager.getInstance().getCont(), 1);
        Assert.assertEquals(CentroVacunacionManager.getInstance().getVacunasParciales(), 10000);
        Assert.assertEquals(CentroVacunacionManager.getInstance().getVacunasCompletas(), 20000);
        Assert.assertEquals(CentroVacunacionManager.getInstance().getAvance(), 0.09f);
        Assert.assertEquals(CentroVacunacionManager.getInstance().getCobertura(), 0.06f);
        Assert.assertTrue(user.logout());
    }
}