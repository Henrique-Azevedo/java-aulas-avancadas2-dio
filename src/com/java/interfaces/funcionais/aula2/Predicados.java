package com.java.interfaces.funcionais.aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {

//  Predicate<String> estaVazio = valor -> valor.isEmpty();
    Predicate<String> estaVazio = String::isEmpty;  //Usando Method Reference
    System.out.println(estaVazio.test(""));
    System.out.println(estaVazio.test("Henrique"));
    }
}
