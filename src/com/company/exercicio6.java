package com.company;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo:");
        double raio = sc.nextDouble();
        double area  = 3.14 * (raio*raio);
        System.out.printf("A área do curculo é: %f cm²",area);
    }
}