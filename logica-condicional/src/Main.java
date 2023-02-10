public class Main {
    public static void main(String[] args) {

        int i1 = 10, i2 = 20;
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
        System.out.println("Boolean 1 é diferente a Boolean 2: "+ (b1 != b2));

    }
}