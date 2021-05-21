package com.company;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){
        double altura, formM,formF;
        String gen;

        System.out.println("Informe seu genero (M)(F): ");
        Scanner sc = new Scanner(System.in);
        gen  = sc.next();

        switch (gen){
            case"M","m":{
                System.out.println("Digite sua altura (m): ");
                altura = sc.nextDouble();
                formM = (72.7*altura)-58;
                System.out.println("Seu peso ideal é: \n" +formM);
            }break;
            case"F","f":{
                System.out.println("Digite sua altura (m): ");
                altura = sc.nextDouble();
                formF = (62.1*altura)-44.7;
                System.out.println("Seu peso ideal é: \n" +formF);
            }break;
            default:{
                System.out.println("GÊNERO INVÁLIDO, DIGITE NOVAMENTE!");
            }
        }
    }
}
