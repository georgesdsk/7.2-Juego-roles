package Enums;

public enum Raza {

    //Cada raza recibe un diferente danio por cada golpe que le den.

    ENANO(3, 7, 8, 0.5 ),GIGANTE(10, 1, 1, 0.1), MAGO(3, 5, 7, 0.4),
    SALTARIN(3, 10, 2, 0.3),MENTIROSO(4,6,10, 0.6);

    private int vida, destreza, inteligencia;
    private double danioPorGolpe;

    Raza(int vida, int destreza, int inteligencia, double danioPorGolpe){

        this.vida = vida;
        this.destreza = destreza;
        this.inteligencia= inteligencia;
        this.danioPorGolpe = danioPorGolpe;
    }

    public int getVida() {
        return vida;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public double getDanioPorGolpe() {
        return danioPorGolpe;
    }
}
