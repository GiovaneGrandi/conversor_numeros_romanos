package com.mentoria;

public class ConversorDeNumerosRomanos {
    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String toRoman(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Número fora do escopo (1-3000)");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                number -= VALUES[i];
                result.append(SYMBOLS[i]);
            }
        }

        return result.toString();
    }
}
