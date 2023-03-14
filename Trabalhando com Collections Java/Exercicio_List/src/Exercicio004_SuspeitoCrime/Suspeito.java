package Exercicio004_SuspeitoCrime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Suspeito {
    public static void main(String[] args) {

        List<Boolean> Perguntas = new ArrayList<Boolean>();
        Perguntas.add(true); //Telefonou para a vítima ?
        Perguntas.add(true); //Esteve no local do crime ?
        Perguntas.add(true); //Mora perto da vítima ?
        Perguntas.add(true); //Devia para a vítima ?
        Perguntas.add(true); //Já trabalhou com a vítima ?

        Iterator<Boolean> iterator = Perguntas.iterator();
        int contTrue = 0;
        while(iterator.hasNext()){
            boolean next = iterator.next();
            if(next == true){
                contTrue++;
            }
        }

        switch (contTrue) {

            case 1:
                System.out.println("Inocente");
                break;

            case 2:
                System.out.println("Suspeito");
                break;

            case 3:
                System.out.println("Cumplice");
                break;

            case 4:
                System.out.println("Cumplice");
                break;

            case 5:
                System.out.println("Assassino");
                break;

        }

    }
}
