public class App {
    public static void main(String[] args) throws Exception {
        
        //Criando objeto para acessar a Classe
        Carro car = new Carro();
        car.setCor("vermelho");
        car.setModelo("Uno Mille");
        car.setCapacidadeTanque(59);

        System.out.println("Modelo: "+ car.getModelo());
        System.out.println("Cor: "+ car.getCor());
        System.out.println("Capacidade do tanque: "+ car.getCapacidadeTanque());
        System.out.println("O valor total para abastecimento do tanque é de R$"+ car.calcularValor(5.19));

        //Informando valores direto no objeto
        Carro carro2 = new Carro("Cinza", "Nivus", 47);
        System.out.println("Modelo: "+ car.getModelo());
        System.out.println("Cor: "+ car.getCor());
        System.out.println("Capacidade do tanque: "+ car.getCapacidadeTanque());
    
    }
}
