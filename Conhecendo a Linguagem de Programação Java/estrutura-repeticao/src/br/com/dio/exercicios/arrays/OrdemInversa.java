package br.com.dio.exercicios.arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {0, -5, 15, 50, 8, 4};

        System.out.println("Vetor Normal");
        int count = 0;
        while(count < (vetor.length)){

            System.out.print(vetor[count] + " ");
            count++;

        }

        System.out.println("\nVetor Invertido");
        for(int i = vetor.length - 1; i > -1; i--){

            System.out.print(vetor[i] + " ");

        }

        

    }
}
