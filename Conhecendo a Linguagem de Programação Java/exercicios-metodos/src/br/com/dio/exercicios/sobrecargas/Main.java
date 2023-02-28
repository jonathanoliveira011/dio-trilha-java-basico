package br.com.dio.exercicios.sobrecargas;

public class Main {
    public static void main(String[] args) {
        
        //Quadrilátero
        System.out.println("Exercício de Sobrecargas e Retornos");

        double areaQuadrado =  Quadrilatero.area(3);
        System.out.println("\nÁrea do quadrado: "+ areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println("\nÁrea do retângulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("\nÁrea do trapézio: "+ areaTrapezio);
        
        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("\nÁrea do losango: "+ areaLosango);

    }
}
