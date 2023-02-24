package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele desejar ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada do 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5x10 = 50
 */

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tabuada;
        
        System.out.print("Tabuada: ");
        tabuada = sc.nextInt();

        Tabuada(tabuada);

               
    }

    public static void Tabuada(int tab){

        if(tab > 0 && tab <= 10){

            System.out.println("Tabuada do "+ tab);
            for(int i = 0; i <= 10; i++){

                System.out.println(tab + " x " + i + " = " + (tab * i));

            }

        } else {

            Scanner sc = new Scanner(System.in);
            System.out.print("Tabuada: ");
            tab = sc.nextInt();

        }

    }

}
