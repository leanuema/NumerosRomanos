package org.example;


public class NumeroRomano {

    private int numero;

    public String convertToRomano(int numero) {

        switch (numero) {
            case 4:
                return "IV";

            case 9:
                return "IX";
        }

        if (numero < 4) {
            return sumarLasI(1, numero, "");

        } else if (numero < 9) {
            return sumarLasI(6, numero, "V");
        }
        return null;
    }


    private String sumarLasI(int inicioCuenta, int numero, String numeroRomano) {
        for (int i = inicioCuenta; i <= numero; i++) {
            numeroRomano += "I";
        }
        return numeroRomano;
    }

}
