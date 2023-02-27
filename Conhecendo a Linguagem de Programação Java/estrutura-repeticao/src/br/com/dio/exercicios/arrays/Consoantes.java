package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/* Faça um programa que leia um valor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

public class Consoantes {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntConsoantes = 0;

        for(int i = 0;i < consoantes.length; i++){

            System.out.print("Digite uma letra: ");
            consoantes[i] = scn.nextLine();

            if(!(consoantes[i].equalsIgnoreCase("a") || 
            consoantes[i].equalsIgnoreCase("e") || 
            consoantes[i].equalsIgnoreCase("i") || 
            consoantes[i].equalsIgnoreCase("o") || 
            consoantes[i].equalsIgnoreCase("u"))){

                qntConsoantes++;

            }

        }

        System.out.println("\n\n Quantidade de consoantes no Array: "+ qntConsoantes);

    }
}
