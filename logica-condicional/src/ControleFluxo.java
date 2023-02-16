public class ControleFluxo {
    public static void main(String[] args) {
        
        //#region Controle de Fluxo usando IF

        int numeroMes = 1;
        String mes = "";

        if (numeroMes == 1){ mes = "Janeiro"; }
        if (numeroMes == 2){ mes = "Feveireiro"; }
        if (numeroMes == 3){ mes = "Março"; }
        if (numeroMes == 4){ mes = "Abril"; }
        if (numeroMes == 5){ mes = "Maio"; }
        if (numeroMes == 6){ mes = "Junho"; }
        if (numeroMes == 7){ mes = "Julho"; }
        if (numeroMes == 8){ mes = "Agosto"; }
        if (numeroMes == 9){ mes = "Setembro"; }
        if (numeroMes == 10){ mes = "Outubro"; }
        if (numeroMes == 11){ mes = "Novembro"; }
        if (numeroMes == 12){ mes = "Dezembro"; }

        System.out.println("Esse é o mês escolhido: "+ mes);

        if (mes == "Janeiro" || mes == "Julho" || mes == "Dezembro"){
             System.out.println("Férias!");
            }
        //#endregion

        //#region Controle de Fluxo usando Switch

        String dia = "Terça";
        
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println(1);
                System.out.println("Dia inválido!");
        } 

        //#endregion

        //#region Controle de Fluxo usando Switch diferente

        int numero = 4;
        switch (numero) {

            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            
            case 4:
                System.out.println("Errado");
                break;
            
            case 5:
                System.out.println("Talvez");
                break;
            
            default:
                System.out.println("Valor indefinido!");
                break;


        }

        //#endregion

    }
}
