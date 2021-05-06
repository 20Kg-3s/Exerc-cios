package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int M, CM, result;
        CM = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distância em Metros:");
        M = sc.nextInt();

        sc.close();

        result = M * CM;

        System.out.println(M + "m, Equivale a: " + result + "cm");
    }
}
