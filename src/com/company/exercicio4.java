package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4, media, qdn;
        qdn = 4; // quantidade de notas.
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota");
        nota2 = sc.nextInt();

        System.out.println("Digite a terceira nota");
        nota3 = sc.nextInt();

        System.out.println("Digite a quarta nota");
        nota4 = sc.nextInt();

        sc.close();

        media = (nota1 + nota2 + nota3 + nota4) / qdn;

        System.out.println("A média alcançada foi: " + media);
    }
}
