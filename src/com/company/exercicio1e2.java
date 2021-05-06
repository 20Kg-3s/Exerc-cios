package com.company;

import java.util.Scanner;

public class exercicio1e2 {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");

        Scanner sc = new Scanner(System.in);
        String numero;

        System.out.println("Digite um número");
        numero = sc.nextLine();

        System.out.println("O numero informado foi: " + numero);
    }
}
