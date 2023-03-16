package Exercicio007_LinguagensFavoritas;

import java.util.*;

public class LinguagensFavoritas {
    public static void main(String[] args) {

        //Set Hash
        Set<Linguagens> minhasLinguagens = new HashSet<>(){{
            add(new Linguagens("C#", 2010, "Visual Studio"));
            add(new Linguagens("Java", 2002, "IntelliJ"));
            add(new Linguagens("Python", 2010, "PyCharm"));
        }};

        //Set Linked
        Set<Linguagens> minhasLinguagensLink = new LinkedHashSet<>(){{
            add(new Linguagens("Java", 2002, "IntelliJ"));
            add(new Linguagens("C#", 2010, "Visual Studio"));
            add(new Linguagens("Python", 2010, "PyCharm"));
        }};

        System.out.println("\n-- \t Ordem Inserção\t--");
        for(Linguagens ling: minhasLinguagensLink) System.out.println(ling.getNome()+ " - "+ ling.getAnoCriacao()+ " - "+ ling.getIde());

        System.out.println("\n-- \t Ordem Natural (Nome)\t--");
        Set<Linguagens> minhasLinguagens2 = new TreeSet<>(minhasLinguagensLink);
        for(Linguagens ling: minhasLinguagens2) System.out.println(ling.getNome()+ " - "+ ling.getAnoCriacao()+ " - "+ ling.getIde());

        System.out.println("\n-- \t Ordem Natural (IDE)\t--");
        Set<Linguagens> minhasLinguagens3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagens3.addAll(minhasLinguagens2);
        for(Linguagens ling: minhasLinguagens3) System.out.println(ling.getNome()+ " - "+ ling.getAnoCriacao()+ " - "+ ling.getIde());

        System.out.println("\n-- \t Ordem Natural (Ano de criacao e Nome)\t--");
        Set<Linguagens> minhasLinguagens4 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagens4.addAll(minhasLinguagens2);
        for(Linguagens ling: minhasLinguagens4) System.out.println(ling.getNome()+ " - "+ ling.getAnoCriacao()+ " - "+ ling.getIde());

        System.out.println("\n-- \t Ordem Natural (Nome | Ano de Criação | IDE)\t--");
        Set<Linguagens> minhasLinguagens5 = new TreeSet<>(new ComparatorNomeAnoIde());
        minhasLinguagens5.addAll(minhasLinguagens2);
        for(Linguagens ling: minhasLinguagens5) System.out.println(ling.getNome()+ " - "+ ling.getAnoCriacao()+ " - "+ ling.getIde());


    }
}

class Linguagens implements Comparable<Linguagens> {
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public Linguagens(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagens that = (Linguagens) o;
        return nome.equals(that.nome) && anoCriacao.equals(that.anoCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }


    @Override
    public int compareTo(Linguagens ling) {
        return this.getNome().compareTo(ling.getNome());
    }
}

class ComparatorIde implements Comparator<Linguagens>{
    @Override
    public int compare(Linguagens l1, Linguagens l2) {

        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<Linguagens>{
    @Override
    public int compare(Linguagens l1, Linguagens l2) {

        int anoCriacao = l1.getAnoCriacao().compareTo(l2.getAnoCriacao());
        if(anoCriacao != 0) return anoCriacao;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<Linguagens>{
    @Override
    public int compare(Linguagens l1, Linguagens l2) {

        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int ano = l1.getAnoCriacao().compareTo(l2.getAnoCriacao());
        if(ano != 0) return ano;

        return l1.getIde().compareTo(l2.getIde());
    }
}
