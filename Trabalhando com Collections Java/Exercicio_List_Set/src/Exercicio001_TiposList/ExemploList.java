package Exercicio001_TiposList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    public static void main(String[] args) {
        
        //Antes do Java 5
        //List notas = new ArrayList();        

        //ArrayList<Double> notas = new ArrayList<>();

        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 8d, 3.6));

        //Neste formato não é possível inserir ou remover informações da lista
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 8d, 3.6);

        //Generics
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("Lista de notas: " + notas + "\t\n");

        System.out.println("Exiba a posição da nota 5: "+ notas.indexOf(5d));

        notas.add(4, 8d);
        System.out.println("\nLista de notas atualizada: " + notas + "\t\n");

        notas.set(notas.indexOf(5d), 6d);
        System.out.println("Lista de notas atualizada: " + notas + "\t\n");

        System.out.println("Nota 5 está na lista ?");
        System.out.println("R: "+ notas.contains(5d));

        System.out.println("\nNotas na ordem em que foram inseridas: ");
        for(double nota : notas) System.out.println(nota); 

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(3));

        System.out.println("Menor nota da lista: "+ Collections.min(notas));

        System.out.println("Maior nota da lista: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){

            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Soma dos valores: "+ soma);

        System.out.println("Média das notas: " + (soma / notas.size()));

        notas.remove(0d);
        System.out.println("Lista depois de remover a nota 0: "+ notas);

        notas.remove(0);
        System.out.println("Lista depois de remover o indice 0: "+ notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){

            Double next = iterator1.next();
            if(next < 7) {

                iterator1.remove();

            }

        }
        System.out.println("Lista sem notas menores que 7: "+ notas);

        notas.clear();
        System.out.println("Lista: "+ notas);

        System.out.println("Lista vazia - "+ notas.isEmpty());
             
    }
}