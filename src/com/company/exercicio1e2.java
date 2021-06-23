package com.company;

import java.util.Scanner;

public class exercicio1e2 {
    public static void main(String[] args) {
        /*1.Faça um Programa que mostre a mensagem "Alo mundo" na tela.
        2.Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].*/
        System.out.println("Olá Mundo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        String numero = sc.nextLine();
        System.out.println("O numero informado foi: " + numero);
    }
}
