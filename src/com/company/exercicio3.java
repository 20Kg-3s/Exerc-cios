package com.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima a soma.
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite dois numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("A soma desses dois números é: " + sum);
    }
}