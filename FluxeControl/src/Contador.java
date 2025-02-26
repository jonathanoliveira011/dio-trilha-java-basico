import java.util.Scanner;

public class Contador extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int param1 = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int param2 = sc.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int par1, int par2) throws ParametrosInvalidosException{
        if(par1 > par2){
            throw new ParametrosInvalidosException();
        } else {
            int dif = par2 - par1;
            for(int i = 0; i < dif; i++){
                System.out.println("Imprimindo o número "+ (i + 1));
            }
        }
    }
}
