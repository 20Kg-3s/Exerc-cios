package com.company;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        int lado, area, dobro;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em cm do lado do quadrado:");

        lado = sc.nextInt();
        area = lado*lado;
        dobro = area * 2;

        System.out.println("A área do quadrado corresponde a: " + area +"cm²");
        System.out.println("O dobro da área é: " + dobro +"cm²");
    }
}
