package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/* Faça um programa que leia numeros inteiros aleatorios (entre 0 e 100) e armazene
 * em um vetor. Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        
        Random rnd = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++){

            numeros[i] = rnd.nextInt(100);

        }

        System.out.println("+== Valores escolhidos e seus sucessores ==+");
        for(int i = 0; i < numeros.length; i++){

            System.out.println("\n"+(i + 1)+"° NUMERO: "+ numeros[i]);
            System.out.println("SUCESSOR: "+ (numeros[i] + 1));

        }
        

    }
}
