import javax.sound.midi.Soundbank;

public class TesteCondicional {
    public static void main(String[] args) {
        
        //OPERADORES RELACIONAIS
        /*int i1 = 10, i2 = 20;
        float f1 = 4.5f, f2 = 3.5f;
        char c1 = 'x', c2 = 'y';
        String s1 = "Fulano", s2 = "Fulano";
        Boolean b1 = true, b2 = false;

        //Comparação inteiros
        System.out.println("Int 1 é maior que Int 2: "+ (i1 > i2));
        System.out.println("Int 1 é menor que Int 2: "+ (i1 < i2));
        System.out.println("Int 1 é maior ou igual a Int 2: "+ (i1 >= i2));
        System.out.println("Int 1 é menor ou igual a Int 2: "+ (i1 <= i2));
        System.out.println("Int 1 é igual a Int 2: "+ (i1 == i2));
        System.out.println("Int 1 é diferente a Int 2: "+ (i1 != i2));

        //Comparação float
        System.out.println("Float 1 é maior que Float 2: "+ (f1 > f2));
        System.out.println("Float 1 é menor que Float 2: "+ (f1 < f2));
        System.out.println("Float 1 é maior ou igual a Float 2: "+ (f1 >= f2));
        System.out.println("Float 1 é menor ou igual a Float 2: "+ (f1 <= f2));
        System.out.println("Float 1 é igual a Float 2: "+ (f1 == f2));
        System.out.println("Float 1 é diferente a Float 2: "+ (f1 != f2));

        //Comparação char
        System.out.println("Char 1 é igual a Char 2: "+ (c1 == c2));
        System.out.println("Char 1 é diferente de Char 2: "+(c1 != c2));

        //Comparação String
        System.out.println("String 1 é igual a String 2: "+ (s1 == s2));
        System.out.println("String 1 é diferente de String 2: "+ (s1 != s2));

        //Comparação boolean
        System.out.println("Boolean 1 é igual a Boolean 2: "+ (b1 == b2));
        System.out.println("Boolean 1 é diferente a Boolean 2: "+ (b1 != b2));*/

        //OPERADORES LÓGICOS
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 - "+ (b1 && b2));
        System.out.println("b1 && b3 - "+ (b1 && b2));

        System.out.println("b2 || b3 - "+ (b2 || b3));
        System.out.println("b2 || b4 - "+ (b2 || b4));

        System.out.println("b1 ^ b3 - "+ (b1 ^ b3));
        System.out.println("b4 ^ b1 - "+ (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1))"+ (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f1 < f1) "+ ((i1 > i2) || (f1 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxílio - "+ recebeAuxilio);

    }
}
