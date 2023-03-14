package Exercicio003_TemperaturaMedia;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperatura {
    public static void main(String[] args) {

        List<Double> tempMedia = new ArrayList<Double>();
        tempMedia.add(36.3); //Janeiro
        tempMedia.add(29.4); //Fevereiro
        tempMedia.add(38.0); //Março
        tempMedia.add(31.7); //Abril
        tempMedia.add(26.9); //Maio
        tempMedia.add(42.1); //Junho

        System.out.println("Temperaturas");
        System.out.println(tempMedia + "\n");

        //Iterator que lê a Lista e faz a soma dos valores
        Iterator<Double> iterator = tempMedia.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){

            Double next = iterator.next();
            soma += next;

        }

        //Calcula a média das temperaturas e exibe no console
        Double mediaTemp = soma / tempMedia.size();
        System.out.println("Média das temperaturas: " + mediaTemp + "\n");

        //Exibe as médias apenas dos meses que forem maiores que a média semestral

        Iterator<Double> iterator2 = tempMedia.iterator();
        Double soma2 = 0d;
        int cont = 0;
        while(iterator2.hasNext()){

            cont++;
            Double next2 = iterator2.next();
            if(next2 > mediaTemp) {

                switch (cont) {

                    case 1:
                        System.out.println("Janeiro - "+ next2 + "°");
                        break;

                    case 2:
                        System.out.println("Fevereiro - "+ next2 + "°");
                        break;

                    case 3:
                        System.out.println("Março - "+ next2 + "°");
                        break;

                    case 4:
                        System.out.println("Abril - "+ next2 + "°");
                        break;

                    case 5:
                        System.out.println("Maio - "+ next2 + "°");
                        break;

                    case 6:
                        System.out.println("Junho - "+ next2 + "°");
                        break;

                }

            }

        }

    }
}
