package Exercicio001_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Stream001 {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","1","2","3","9","9","6","5");

        System.out.println("Imprime todos os elementos dessa lista de String: ");
        /*numerosAleatorios.stream().forEach(System.out::print());*/

        /* numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + "\t");
            }
        });*/

        numerosAleatorios.forEach(s -> System.out.print(s + "\t"));
        System.out.println("\n");

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um SET: ");
        numerosAleatorios.stream().limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatorio = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatorio);

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista");
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);

        System.out.println("\nMostre a média dos valores: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("\nRemova os valores impares");
        numerosAleatorio.removeIf(integer -> (integer %2 != 0));
        System.out.println(numerosAleatorio);

    }
}
