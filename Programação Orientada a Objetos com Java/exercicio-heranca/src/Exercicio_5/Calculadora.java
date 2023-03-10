package Exercicio_5;

import Exercicio_4.*;

class Calculadora implements OperacaoMatematica {
    
    @Override
    public void Somar(int a, int b){

        System.out.println("Resultado: " + (a + b));

    }
    @Override
    public void Subtrair(int a, int b){

        System.out.println("Resultado: " + (a - b));

    }
    @Override
    public void Multiplicar(int a, int b){

        System.out.println("Resultado: " + (a * b));

    }
    @Override
    public void Dividir(int a, int b){

        System.out.println("Resultado: " + (a / b));

    }

    //Chamada da classe Compra do pacote Exercicio_4
    Compra comp = new Compra();

}
