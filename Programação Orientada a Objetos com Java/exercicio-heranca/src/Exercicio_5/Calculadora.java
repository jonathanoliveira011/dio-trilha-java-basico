package Exercicio_5;

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

}
