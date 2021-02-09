package Enums;

public enum Arma {

    PALO(2),ESPADA(3),HACHA(4), LANZA(4), BALLESTA(2), ESCUDO(1), NADA(0);

    private int danio;


    Arma(int danio){
        this.danio = danio;
    }

    public int getDanio(){

        return this.danio;

    }



}
