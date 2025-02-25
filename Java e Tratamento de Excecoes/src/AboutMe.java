import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nome = null;
        String sobrenome = null;
        int idade = 0;
        double altura = 0;
        try {
            System.out.print("Digite seu nome: ");
            nome = sc.next();

            System.out.print("Digite seu sobrenome: ");
            sobrenome = sc.next();

            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.print("Digite a sua altura:");
            altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura);
            sc.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos IDADE e ALTURA devem ser numéricos.");
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

    }
}