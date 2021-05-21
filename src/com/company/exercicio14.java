package com.company;


import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        double peso, multa, pesoexd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso total dos  peixes (kg): ");
        peso = sc.nextDouble();

        if (peso>50){
            pesoexd = peso - 50;
            multa = pesoexd*4;
            System.out.println("Peso excedente: " +pesoexd);
            System.out.println("Multa a ser paga: " +multa);
        }else{
            System.out.println("Peso dentro do regulamento!");
        }
    }
}
