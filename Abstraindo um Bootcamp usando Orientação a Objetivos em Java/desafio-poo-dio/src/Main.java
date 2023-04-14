import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(12);

        //Polimorfismo
        //É possível estanciar a classe Curso e Mentoria (classes filhas) a partir de Conteudo (classe mãe)
        Conteudo c1 = new Curso();
        Conteudo c2 = new Mentoria();


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println("\n" + curso1);
        System.out.println("\n" + curso2);
        System.out.println("\n" + mentoria1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);

        Dev jonathan = new Dev();
        jonathan.setNome("Jonathan");
        jonathan.increverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos: "+ jonathan.getConteudoInscritos());
        jonathan.progredir();
        System.out.println("\nConteudos Inscritos: "+ jonathan.getConteudoInscritos());
        System.out.println("Conteudos Concluídos: "+ jonathan.getConteudoConcluidos());

        System.out.println("--------------------------------------------------------");

        Dev joao = new Dev();
        joao.setNome("João");
        joao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ joao.getConteudoInscritos());
        joao.progredir();
        System.out.println("\nConteudos Inscritos: "+ joao.getConteudoInscritos());
        System.out.println("Conteudos Concluídos: "+ joao.getConteudoConcluidos());



    }
}
