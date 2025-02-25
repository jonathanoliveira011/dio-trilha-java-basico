import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //TODO: Exibir as mensagens para o usuário
        System.out.println("Bem vindo ao DIO Bank! \n");

        System.out.print("Por favor, digite o número da sua agência (xxx-x): ");
        agencia = sc.next();

        System.out.print("Por favor, digite o número da sua conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();

        System.out.print("Por favor, digite o saldo para iniciar a conta: ");
        saldo = sc.nextDouble();

        //TODO: Exibir a mensagem da conta criada
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");

    }
}