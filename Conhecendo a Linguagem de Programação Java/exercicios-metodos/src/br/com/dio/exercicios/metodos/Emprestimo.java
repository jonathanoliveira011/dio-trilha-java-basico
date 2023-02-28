package br.com.dio.exercicios.metodos;
public class Emprestimo {
    
   public static double TaxaDuasParcelas(){

    return 0.3;

   } 
   public static double TaxaTresParcelas(){

    return 0.45;

   } 

   public static void calcularEmprestimo(double valor, int parcelas){

    if(parcelas == 2){

        double valorFinal = (valor + (valor * TaxaDuasParcelas()));
        System.out.println("Valor final para duas parcelas: "+ valorFinal);


    } else if (parcelas == 3){

        double valorFinal = (valor + (valor * TaxaTresParcelas()));
        System.out.println("Valor final para duas parcelas: "+ valorFinal);

    } else {

        System.out.println("Quantidade de parcelas não aceita!");

    }

   }

}
