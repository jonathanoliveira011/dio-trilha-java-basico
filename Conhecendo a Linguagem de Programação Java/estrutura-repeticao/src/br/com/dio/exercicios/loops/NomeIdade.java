package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare inserindo o valor de 0 no campo nome)
 */

public class NomeIdade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade;

        while(true){

            System.out.print("Nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;
            System.out.print("\nIdade: ");
            idade = sc.nextInt();

        }
        
        System.out.println("\nFinalizado");

    }
}
