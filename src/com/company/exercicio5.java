package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //aça um Programa que converta metros para centímetros.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em metro para ser convertido em cm");
        double conversao = sc.nextDouble() * 100;
        System.out.println("O valor digitado equivale a: "+conversao+"cm");
    }
}
