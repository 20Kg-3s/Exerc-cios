package com.company;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        double altura, form;

        System.out.println("Digite a altura(m): ");
        Scanner sc = new Scanner(System.in);
        altura = sc.nextDouble();

        form = (72.7*altura)-58;

        System.out.println("Seu peso ideal é: \n" + form);
    }
}
