public class Operadores {
    public static void main(String[] args) {
        
        //Operadores matemáticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        //Usando operadores para junção em string
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //Concatenação
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;

        //Para alterar o valor é necessário atribuir conforme exemplo abaixo
        numero = -numero;

        System.out.println(numero);

        //Para alterar valor para positivo é necessário realizar desta forma
        numero = numero * -1;

        System.out.println(numero);

        //Atribuição de valor com incremento
        int numeroo = 5;
        numeroo++;
        System.out.println(numeroo);

        //Caso for necessário incrementar dentro da impressão é necessário realizar desta forma
        System.out.println(++numero);

        //Caso for necessário inverter uma varíavel booleana
        boolean variavel = true;
        System.out.println(!variavel);

        //Operadores Ternário
        int a , b;
        String resultadoo = "";
        a = 6;
        b = 6;

        resultadoo = a==b ? "verdadeiro" : "falso";
        System.out.println(resultadoo);

        //Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
	        System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	        System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
        	System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
        	System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
        	System.out.print("Numero 1 é diferente de numero 2");

        if(numero1 == numero2)
        	System.out.print("Numero 1 é igual a numero 2");

        //Operadores lógicos

        boolean Cond1 = true;
        boolean Cond2 = false;

        if(Cond1 && Cond2){

            System.out.println("Ambas são verdadeiras!\n");

        }

        if(Cond1 || Cond2){

            System.out.println("Umas delas é verdadeira!\n");

        }

        

    }
}
