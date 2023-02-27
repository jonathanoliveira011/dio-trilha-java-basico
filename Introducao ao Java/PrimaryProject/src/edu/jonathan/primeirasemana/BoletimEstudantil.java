public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if(mediaFinal < 6){
            System.out.println("REPROVADO!!");
        } else if (mediaFinal == 6){
            System.out.println("PASSOU NA TRAVE!!");
        } else {
            System.out.println("APROVADO!!");
        }
    }
}
