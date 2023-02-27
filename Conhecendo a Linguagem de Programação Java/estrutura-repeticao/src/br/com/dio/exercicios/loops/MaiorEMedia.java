package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia 5 números
 * e informe o maior número, 
 * calcule a média desses números.
 */

public class MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero,cont = 0, maior = 0;
        double media = 0;

        do {

            System.out.print("Numero: ");
            numero = sc.nextInt();
            if(numero > maior){

                maior = numero;

            }
            media = media + numero;
            cont++;

        } while (cont < 5);

        System.out.println("Maior número: "+ maior);
        System.out.println("Media: "+ (media / 5));


    }
}
