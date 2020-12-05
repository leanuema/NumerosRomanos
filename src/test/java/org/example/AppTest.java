package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    @Test
    public void verificarVeintenaANumeroRomano(){
        List<Integer> numerosNaturales = Arrays.asList(20, 21, 22,23,24,25,26,27,28,29);
        List<String> romanos = numerosNaturales.stream().map(
                number -> numerosRomanos.convertToRomano(number)).collect(Collectors.toList());

        Assert.assertEquals(romanos.get(0), "XX");
        Assert.assertEquals(romanos.get(1), "XXI");
        Assert.assertEquals(romanos.get(2), "XXII");
        Assert.assertEquals(romanos.get(3), "XXIII");
        Assert.assertEquals(romanos.get(4), "XXIV");
        Assert.assertEquals(romanos.get(5), "XXV");
        Assert.assertEquals(romanos.get(6), "XXVI");
        Assert.assertEquals(romanos.get(7), "XXVII");
        Assert.assertEquals(romanos.get(8), "XXVIII");
        Assert.assertEquals(romanos.get(9), "XXIX");
    }

    @Test
    public void verificartTreintenaANumeroRomano(){
        List<Integer> numerosNaturales = Arrays.asList(30, 31, 32,33,34,35,36,37,38,39);
        List<String> romanos = numerosNaturales.stream().map(
                number -> numerosRomanos.convertToRomano(number)).collect(Collectors.toList());

        Assert.assertEquals(romanos.get(0), "XXX");
        Assert.assertEquals(romanos.get(1), "XXXI");
        Assert.assertEquals(romanos.get(2), "XXXII");
        Assert.assertEquals(romanos.get(3), "XXXIII");
        Assert.assertEquals(romanos.get(4), "XXXIV");
        Assert.assertEquals(romanos.get(5), "XXXV");
        Assert.assertEquals(romanos.get(6), "XXXVI");
        Assert.assertEquals(romanos.get(7), "XXXVII");
        Assert.assertEquals(romanos.get(8), "XXXVIII");
        Assert.assertEquals(romanos.get(9), "XXXIX");
    }

    @Test
    public void verificartDecimalesRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(40, 50 ,60, 70, 80, 90, 88, 95);
        List<String> romanos = numerosNaturales.stream().map(
                number -> numerosRomanos.convertToRomano(number)).collect(Collectors.toList());

        Assert.assertEquals(romanos.get(0), "XL");
        Assert.assertEquals(romanos.get(1), "L");
        Assert.assertEquals(romanos.get(2), "LX");
        Assert.assertEquals(romanos.get(3), "LXX");
        Assert.assertEquals(romanos.get(4), "LXXX");
        Assert.assertEquals(romanos.get(5), "XC");
        Assert.assertEquals(romanos.get(6), "LXXXVIII");
        Assert.assertEquals(romanos.get(7), "XCV");

    }

    @Test
    public void verificarRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(100, 200 ,300 , 400, 500, 600, 700, 800, 900, 3234);
        List<String> romanos = numerosNaturales.stream().map(
                number -> numerosRomanos.convertToRomano(number)).collect(Collectors.toList());

        Assert.assertEquals(romanos.get(0), "C");
        Assert.assertEquals(romanos.get(1), "CC");
        Assert.assertEquals(romanos.get(2), "CCC");
        Assert.assertEquals(romanos.get(3), "CD");
        Assert.assertEquals(romanos.get(4), "D");
        Assert.assertEquals(romanos.get(5), "DC");
        Assert.assertEquals(romanos.get(6), "DCC");
        Assert.assertEquals(romanos.get(7), "DCCC");
        Assert.assertEquals(romanos.get(8), "CM");
        Assert.assertEquals(romanos.get(9), "MMMCCXXXIV");

    }
}
