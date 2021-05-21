package com.company;

import java.util.Scanner;

public class exercicio11 {
    public static void main( String[] args){
        int num1, num2;
        float num3;

        System.out.println("Digite dois numeros inteiros: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Digite um número real: ");
        num3 = sc.nextFloat();

        System.out.println("produto do dobro do primeiro com metade do segundo: \n"+(num1*2) * (num2/2));
        System.out.println("soma do triplo do primeiro com o terceiro: \n" +((num1*3) +(num3)));
        System.out.println("terceiro elevado ao cubo: \n" +(num3*num3*num3));



    }
}
