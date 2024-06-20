package com.mentoria

import spock.lang.Specification
import spock.lang.Unroll

class ConversorDeNumerosRomanosSpec extends Specification {
    def "toRoman deve lançar IllegalArgumentException para números fora do intervalo"() {
        given:
        ConversorDeNumerosRomanos converter = new ConversorDeNumerosRomanos()

        when:
        converter.toRoman(number)

        then:
        thrown(IllegalArgumentException)

        where:
        number << [-1, 0, 3005, 4000, 5000]
    }

    @Unroll
    def "toRoman deve converter #number para #expected"() {
        given:
        ConversorDeNumerosRomanos converter = new ConversorDeNumerosRomanos()

        expect:
        converter.toRoman(number) == expected

        where:
        number || expected
        1      || "I"
        4      || "IV"
        9      || "IX"
        14     || "XIV"
        40     || "XL"
        90     || "XC"
        400    || "CD"
        500    || "D"
        900    || "CM"
        1000   || "M"
        1987   || "MCMLXXXVII"
    }
}
