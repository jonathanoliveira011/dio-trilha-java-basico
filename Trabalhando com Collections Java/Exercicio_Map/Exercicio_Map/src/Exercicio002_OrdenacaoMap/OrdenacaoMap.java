package Exercicio002_OrdenacaoMap;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        Map<String, Livro> meusLivrosLink = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        Map<String, Livro> meusLivrosTree = new TreeMap<>(meusLivrosLink) {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        System.out.println("-- \t Ordem aleatória \t --");
        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()){

            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        }

        System.out.println("\n-- \t Ordem de inserção\t --");
        for(Map.Entry<String, Livro> livro: meusLivrosLink.entrySet()){

            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        }

        System.out.println("\n-- \t Ordem alfabética dos autores \t --");
        for(Map.Entry<String, Livro> livro: meusLivrosTree.entrySet()){

            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        }

        System.out.println("\n-- \t Ordem alfabética dos livros \t --");
        Set<Map.Entry<String, Livro>> meusLivrosSetLivros = new TreeSet<>(new ComparatorNome());
        meusLivrosSetLivros.addAll(meusLivrosLink.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivrosSetLivros){

            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        }

        System.out.println("\n-- \t Ordem das páginas \t --");
        Set<Map.Entry<String, Livro>> meusLivrosSetPaginas = new TreeSet<>(new ComparatorPagina());
        meusLivrosSetPaginas.addAll(meusLivrosLink.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivrosSetPaginas){

            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        }

    }
}

class Livro {

    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
