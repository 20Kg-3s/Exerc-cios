package com.company;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        double c, f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C: ");

        c = sc.nextDouble();
        f = 1.8 * c + 32;

        System.out.println(c+ "°C, Corresponde a: " + f + "°F");
    }
}
