import Exercicio_2.Faxineiro;
import Exercicio_2.Funcionario;
import Exercicio_2.Gerente;
import Exercicio_2.Vendedor;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
