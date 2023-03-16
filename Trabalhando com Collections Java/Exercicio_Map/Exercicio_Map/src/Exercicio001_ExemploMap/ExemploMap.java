package Exercicio001_ExemploMap;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.4);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 16.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: "+ carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: "+ carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos: "+ carrosPopulares.keySet());

        System.out.println("\nExiba os consumos dos carros: "+ carrosPopulares.values());

        Double carEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modEficiente = "";
        for(Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(carEconomico)) {
                modEficiente = entry.getKey();
                System.out.println("\nExiba o modelo mais econômico e seu consumo: " + modEficiente + " - " + carEconomico);
            }
        }

        Double minConsumo = Collections.min(carrosPopulares.values());
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
                if(entry.getValue().equals(minConsumo)){
                    String modMenosEficiente = entry.getKey();
                    System.out.println("\nModelo menos eficiente: "+ modMenosEficiente + " - "+ minConsumo);
                }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            
            Double next = iterator.next();
            soma += next;
            
        }
        System.out.println("\nExiba a soma dos consumos: "+ soma);

        System.out.println("\nExiba as médias deste dicionário de carros: "+ (soma / carrosPopulares.size()));


        System.out.println("\nRemova os modelos com consumo igual a 15,6 km/l: ");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares.toString());


        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.4);
            put("kwid", 15.6);
        }};
        System.out.println("\nExiba todos os carros na ordem em que foram informados: "+ carrosPopulares1);

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println("\nExiba o dicionário ordenado pelo modelo: "+ carrosPopulares2);

        carrosPopulares.clear();
        System.out.println("Apague o dicionário de carros: "+ carrosPopulares.isEmpty());

    }
}
