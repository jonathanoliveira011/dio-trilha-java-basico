package br.com.dio.exercicios.metodos;
public class Mensagem {

    public static void ObterMensagem(int hora){

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            System.out.println("Bom dia caro telespectador!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            System.out.println("Boa tarde caro telespectador!");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.println("Boa noite caro telespectador!");

                break;
            default:
                System.out.println("Hora inválida.");
                break;

        }

    }
}
