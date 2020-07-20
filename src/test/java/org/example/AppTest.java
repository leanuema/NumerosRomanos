package org.example;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    NumeroRomano numerosRomanos = new NumeroRomano();


    @Test
    public void pasar1ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(1);
        Assert.assertEquals(romano, "I");
    }

    @Test
    public void pasar2ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(2);
        Assert.assertEquals(romano, "II");
    }

    @Test
    public void pasar3ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(3);
        Assert.assertEquals(romano, "III");
    }

    @Test
    public void pasar4ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(4);
        Assert.assertEquals(romano, "IV");
    }

    @Test
    public void pasar5ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(5);
        Assert.assertEquals(romano, "V");
    }

    @Test
    public void pasar6ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(6);
        Assert.assertEquals(romano, "VI");
    }

    @Test
    public void pasar7ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(7);
        Assert.assertEquals(romano, "VII");
    }

    @Test
    public void pasar8ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(8);
        Assert.assertEquals(romano, "VIII");
    }

    @Test
    public void pasar9ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(9);
        Assert.assertEquals(romano, "IX");
    }
}
