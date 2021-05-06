package com.company;

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args) {
        double vph /*valor por hora*/, nht /* numero de horas trabalhadas */, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Valor recebido por hora de trabalho: ");
        vph = sc.nextFloat();

        System.out.println("Horas trabalhadas no Mês: ");
        nht = sc.nextFloat();

        result = vph * nht;
        System.out.println("você deve receber R$" + result + " por seu trabalho no referido mês");


    }
}
