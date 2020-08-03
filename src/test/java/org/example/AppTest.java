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

    @Test
    public void pasar10ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(10);
        Assert.assertEquals(romano, "X");
    }

    @Test
    public void pasar11ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(11);
        Assert.assertEquals(romano, "XI");
    }

    @Test
    public void pasar12ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(12);
        Assert.assertEquals(romano, "XII");
    }

    @Test
    public void pasar13ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(13);
        Assert.assertEquals(romano, "XIII");
    }

    @Test
    public void pasar14ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(14);
        Assert.assertEquals(romano, "XIV");
    }

    @Test
    public void pasar15ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(15);
        Assert.assertEquals(romano, "XV");
    }

    @Test
    public void pasar16ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(16);
        Assert.assertEquals(romano, "XVI");
    }

    @Test
    public void pasar17ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(17);
        Assert.assertEquals(romano, "XVII");
    }

    @Test
    public void pasar18ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(18);
        Assert.assertEquals(romano, "XVIII");
    }

    @Test
    public void pasar19ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(19);
        Assert.assertEquals(romano, "XIX");
    }

    @Test
    public void pasar20ANumeroRomano() {
        String romano = numerosRomanos.convertToRomano(20);
        Assert.assertEquals(romano, "XX");
    }

}
