package com.company;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        double f, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em ºF: ");
        f = sc.nextDouble();

        c = 5*((f-32)/9);
        System.out.println(f + " Em Célcius corresponde a: " +c+"ºC");
    }
}
