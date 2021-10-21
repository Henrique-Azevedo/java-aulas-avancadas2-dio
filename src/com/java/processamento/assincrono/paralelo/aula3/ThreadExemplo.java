package com.java.processamento.assincrono.paralelo.aula3;

import com.sun.source.tree.NewArrayTree;

public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPDF = new GeradorPDF();
        BarraCarregamento iniciarBarraDeCarregamento = new BarraCarregamento(iniciarGeradorPDF);

        iniciarBarraDeCarregamento.start();
        iniciarGeradorPDF.start();

    }
}

class GeradorPDF extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}
class BarraCarregamento extends Thread{
    private Thread iniciarGeradorPDF;

    public BarraCarregamento(Thread iniciarGeradorPDF){
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(500);

                if (!iniciarGeradorPDF.isAlive()){
                    break;
                }
                System.out.println("Loading...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}