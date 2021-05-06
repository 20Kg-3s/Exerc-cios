package com.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        sc.close();

        sum = num1 + num2;

        System.out.println("A soma desses dois números é: " + sum);
    }
}
