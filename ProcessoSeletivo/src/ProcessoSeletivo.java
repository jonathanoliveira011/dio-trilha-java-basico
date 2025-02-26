import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimeSelecionados() {
        String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
        System.out.println("Imprime lista de candidatos com índice");
        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i + 1) + " é " +candidatos[i]);
        }

        System.out.println("\n\nImprimir os candidatos usando for each");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static double geraValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void selecionaCandidatos(){
        String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = geraValorPretendido();
            System.out.println("O candidato " + candidato +" solicitou este valor de salário: " + salarioPretendido + "\n");
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!\n");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double pretensaoSalarial){
        double salarioBase = 2000.0;
        if(salarioBase > pretensaoSalarial){
            System.out.println("Ligar para o candidato");
        }  else if(salarioBase == pretensaoSalarial){
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado dos demais canditatos");
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativas < 3);{
            if(atendeu){
                System.out.println("Conseguimos contato com "+ candidato + " na "+ tentativas + "ª tentativa.");
            } else {
                System.out.println("Não conseguimos contato com "+ candidato +", números máximos de tentativas.");
            }
        }
    }
}