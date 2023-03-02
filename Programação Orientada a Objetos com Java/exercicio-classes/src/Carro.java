class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    //#region Construtor
    Carro(){



    }
    //#endregion

    //#region Construtor com parâmetros
    Carro(String cor, String modelo, int capacidadeTanque){

        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }
    //#endregion

    //#region Get e set dos atributos
    void setCor(String cor){

        this.cor = cor;

    }

    String getCor(){

        return cor;

    }

    void setModelo(String modelo){

        this.modelo = modelo;

    }

    String getModelo(){

        return modelo;

    }

    void setCapacidadeTanque(int capacidadeTanque){

    this.capacidadeTanque = capacidadeTanque;

    }

    int getCapacidadeTanque() {

        return capacidadeTanque;

    }
    //#endregion

    //#region Método que realiza ação na classe
    double calcularValor(double vlrGasolina){

        double resultado = vlrGasolina * getCapacidadeTanque();
        return resultado;

    }
    //#endregion

}