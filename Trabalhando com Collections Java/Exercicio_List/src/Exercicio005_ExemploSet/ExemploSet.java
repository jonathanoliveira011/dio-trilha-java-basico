package Exercicio005_ExemploSet;

import java.sql.Array;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto - "+ notas.contains(5d));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){

            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Exiba a soma dos valores: "+ soma);

        System.out.println("Exiba a media dos valores: "+ (soma / notas.size()));

        notas.remove(8d);
        System.out.println("Nota 8.0 removida - "+ notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println("Lista sem notas menores que 7.0 - "+ notas);

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));

        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Exiba todas as notas na ordem crescente - "+ notas3);

        notas.clear();
        notas2.clear();
        System.out.println("Conjunto 1 vazio ? - "+ notas.isEmpty());
        System.out.println("Conjunto 2 vazio ? - "+ notas2.isEmpty());

    }
}
