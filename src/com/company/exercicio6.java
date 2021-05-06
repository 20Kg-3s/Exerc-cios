package com.company;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o raio do circulo:");
        r = sc.nextInt();
        area = pi * (r*r);
        System.out.println("A área do circulo é:" + area +"cm²");
    }
}
