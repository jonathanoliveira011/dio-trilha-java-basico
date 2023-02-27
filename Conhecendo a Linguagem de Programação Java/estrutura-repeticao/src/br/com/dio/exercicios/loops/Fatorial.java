package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Calcule um fatorial de um número inteiro fornecido
 * pelo usuário
 * Ex: 5 != 120
 */

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int vlrFat;

        System.out.print("Fatorial: ");
        vlrFat = sc.nextInt();

        for(int i = vlrFat - 1;i > 1;i--){

            vlrFat = vlrFat * i;

        }

        System.out.println("\nResultado do fatorial: "+ vlrFat);
        
    }
    
}
