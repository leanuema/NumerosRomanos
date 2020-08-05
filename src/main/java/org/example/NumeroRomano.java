package org.example;


import java.util.Arrays;
import java.util.List;

public class NumeroRomano {

    private static final List<String> simboloRomano = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertToRomano(Integer numeroNatural) {

        char[] numeroChart = numeroNatural.toString().toCharArray();
        int inc = 0;
        String resultado = "";

        for (int i = numeroChart.length - 1; i >= 0; i--) {
            String romano = generico(Character.getNumericValue(numeroChart[i]), inc, 1 + inc, 2 + inc);
            resultado = romano + resultado;
            inc += 2;
        }
        return resultado;
    }

    private String sumar(int inicioCuenta, int numero, String numeroRomano, String incrementoRomano) {
        for (int i = inicioCuenta; i <= numero; i++) {
            numeroRomano += incrementoRomano;
        }
        return numeroRomano;
    }

    private String generico(int decena, int x, int y, int z) {
        switch (decena) {
            case 4:
                return simboloRomano.get(x) + simboloRomano.get(y);

            case 9:
                return simboloRomano.get(x) + simboloRomano.get(z);
        }

        if (decena < 4) {
            return sumar(1, decena, "", simboloRomano.get(x));

        } else if (decena < 9) {
            return sumar(6, decena, simboloRomano.get(y), simboloRomano.get(x));
        }
        return null;
    }
}
