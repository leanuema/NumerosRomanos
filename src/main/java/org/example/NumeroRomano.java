package org.example;


import java.util.Arrays;
import java.util.List;

public class NumeroRomano {

    private static final List<String> romeSymbol = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertToRomano(Integer numeroNatural) {

        char[] numeroChart = numeroNatural.toString().toCharArray();
        int inc = 0;
        String resultado = "";

        for (int i = numeroChart.length - 1; i >= 0; i--) {
            String romano = generic(Character.getNumericValue(numeroChart[i]), inc, 1 + inc, 2 + inc);
            resultado = romano + resultado;
            inc += 2;
        }
        return resultado;
    }

    private String sum(int inicioCuenta, int numero, String numeroRomano, String incrementoRomano) {
        for (int i = inicioCuenta; i <= numero; i++) {
            numeroRomano += incrementoRomano;
        }
        return numeroRomano;
    }

    private String generic(int decena, int x, int y, int z) {
        switch (decena) {
            case 4:
                return romeSymbol.get(x) + romeSymbol.get(y);

            case 9:
                return romeSymbol.get(x) + romeSymbol.get(z);
        }

        if (decena < 4) {
            return sum(1, decena, "", romeSymbol.get(x));

        } else if (decena < 9) {
            return sum(6, decena, romeSymbol.get(y), romeSymbol.get(x));
        }
        return null;
    }
}
