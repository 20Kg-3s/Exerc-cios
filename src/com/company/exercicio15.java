package com.company;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){
        float hrsTrab,valPorHora,salBruto;
        double IR,INSS,sind;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto você recebe por hora: ");
        valPorHora = sc.nextFloat();
        System.out.println("Digite as horas trabalhadas: ");
        hrsTrab = sc.nextFloat();

        salBruto = hrsTrab*valPorHora;
        System.out.println("Salário bruto: R$" +salBruto);

        IR = (salBruto * 0.11);
        System.out.println("- IR (11%) : R$" +IR);

        INSS = (salBruto * 0.08);
        System.out.println("- INSS (8%) : R$" +INSS);

        sind  = (salBruto*0.05);
        System.out.println("- Sindicato (5%) : R$" +sind+ "=");
        System.out.println("Salário Líquido: R$" +(salBruto*0.76));
    }
}
