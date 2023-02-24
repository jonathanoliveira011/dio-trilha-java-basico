package br.com.dio.exercicios.loops;

/* Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int qntNumeros, numero = 0, qntPar = 0, qntImpar = 0;

        System.out.print("Quantidade de números: ");
        qntNumeros = sc.nextInt();

        for(int i = 0; i < qntNumeros; i++){

            System.out.print("\nNumero: ");
            numero = sc.nextInt();

            if(numero % 2 == 0){ qntPar++; }
            else { qntImpar++; }

        }

        System.out.println("\n============================");
        System.out.println("= Números Pares: " + qntPar);
        System.out.println("= Números ímpares: "+ qntImpar);
        System.out.println("============================");

    }
}
