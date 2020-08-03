package org.example;


public class NumeroRomano {

    public String convertToRomano(Integer numeroNatural) {

        char[] numeroChart = numeroNatural.toString().toCharArray();

        if (numeroChart.length >= 2) {
            String unidadRomana = pasarUnidad(Character.getNumericValue(numeroChart[1]));
            String decenaRomana = pasarDecena(Character.getNumericValue(numeroChart[0]));
            return decenaRomana + unidadRomana;
        } else {
            return pasarUnidad(Character.getNumericValue(numeroChart[0]));
        }
    }


    private String sumarLasI(int inicioCuenta, int numero, String numeroRomano) {
        for (int i = inicioCuenta; i <= numero; i++) {
            numeroRomano += "I";
        }
        return numeroRomano;
    }

    private String pasarUnidad(int unidad) {
        switch (unidad) {
            case 4:
                return "IV";

            case 9:
                return "IX";
        }

        if (unidad < 4) {
            return sumarLasI(1, unidad, "");

        } else if (unidad < 9) {
            return sumarLasI(6, unidad, "V");
        }
        return null;
    }

    private String pasarDecena(int decena) {
        switch (decena) {
            case 1:
                return "X";
            case 2:
                return "XX";
        }
        return null;
    }

}
