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
        Assert.assertTrue(user.logout());
    }
}