import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println("\n" + curso1);
        System.out.println("\n" + curso2);
        System.out.println("\n" + mentoria1);

    }
}
