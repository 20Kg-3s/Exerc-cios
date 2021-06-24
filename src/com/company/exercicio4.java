package com.company;

import java.util.Scanner;

public class exercicio4 {
    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas 4 notas bimestrais");
        int [] notas = new int[4];
        int soma =0;
        for (int i=0;i< notas.length;i++){
            notas[i] = sc.nextInt();
            soma += notas[i];
        }
        System.out.println("A média das notas é: "+(soma/ notas.length));
    }
}
