package com.java.interfaces.funcionais.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoCotratio = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoCotratio.apply("Henrique"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
    }
}
