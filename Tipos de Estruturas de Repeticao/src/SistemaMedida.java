public class SistemaMedida {
    public static void main(String[] args) {

        //TODO: Exemplo de switch/case usando tabela de tamanhos
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default: {
                System.out.println("Indefinido");
            }
        }
    }
}
