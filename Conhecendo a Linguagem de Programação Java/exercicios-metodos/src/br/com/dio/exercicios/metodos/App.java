package br.com.dio.exercicios.metodos;
public class App {
    public static void main(String[] args) throws Exception {
        
       //Calculadora
       System.out.println("CALCULADORA"); 
       Calculadora.Somar(3, 6);
       Calculadora.Subtrair(4, 5);
       Calculadora.Multiplicar(3, 6);
       Calculadora.Dividir(8, 2);  

       //Mensagens
       System.out.println("\nMENSAGEM");
       Mensagem.ObterMensagem(07);
       Mensagem.ObterMensagem(14);
       Mensagem.ObterMensagem(22);
       Mensagem.ObterMensagem(03);

       //Empréstimo
       System.out.println("\nEMPRÉSTIMO");
       Emprestimo.calcularEmprestimo(1100, 2);
       Emprestimo.calcularEmprestimo(1400, 3);
       Emprestimo.calcularEmprestimo(2000, 5);

        
    }
}
