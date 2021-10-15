package com.java.interfaces.funcionais.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
    //    imprimirNomesFiltrados(nomes);
    //    imprimirTodosNomes(nomes);
    //    ImprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projetos");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);

    }

    public static void imprimirNomesFiltrados(String... nomes){

        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length ; i++ ){
            if (nomes[i].equals("Joao")){
              nomesParaImprimir+=" "+nomes[i];
            }
        }
        System.out.println("Nomes do for: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining()); //String

        System.out.println("Nomes da Stream: "+nomesParaImprimirDaStream);

    }

    public static void imprimirTodosNomes(String... nomes){
        for (String nome : nomes) {
            System.out.println("Impresso pelo for: "+nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Impresso pelo forEach: "+nome));
    }

    public static void ImprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }
        Stream.of(numeros).map( numero -> numero*2)
                           .forEach(System.out::println);
    }


}
