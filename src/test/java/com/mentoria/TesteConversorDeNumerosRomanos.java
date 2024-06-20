package com.mentoria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteConversorDeNumerosRomanos {
    @Test
    public void testToRoman() {
        ConversorDeNumerosRomanos converter = new ConversorDeNumerosRomanos();
        assertEquals("I", converter.toRoman(1));
        assertEquals("IV", converter.toRoman(4));
        assertEquals("IX", converter.toRoman(9));
        assertEquals("XIV", converter.toRoman(14));
        assertEquals("XL", converter.toRoman(40));
        assertEquals("XC", converter.toRoman(90));
        assertEquals("CD", converter.toRoman(400));
        assertEquals("D", converter.toRoman(500));
        assertEquals("CM", converter.toRoman(900));
        assertEquals("M", converter.toRoman(1000));
        assertEquals("MCMLXXXVII", converter.toRoman(1987));
    }
}
