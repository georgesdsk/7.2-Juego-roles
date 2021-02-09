package Enums;

public enum Hechizo {

    //Los hechizos tienen el poder de quitar o el arma o/y el hechizo a quien se lo lanzes;

    BOLA_FUEGO(10, false, false),
    BOLA_HIELO(4,false,true ),
    MIRADA_INFERNAL(5,true, false),
    SENTADILLA_ASESINA(1, false, false),
    NADA(0, false, false);

    private int danio;
    private boolean quitarArma, quitarHechizo;

    Hechizo(int danio,boolean quitarArma, boolean quitarHechizo ){

        this.danio = danio;
        this.quitarArma = quitarArma;
        this.quitarHechizo = quitarHechizo;

    }

    public int getDanio() {
        return danio;
    }

    public boolean isQuitarArma() {
        return quitarArma;
    }

    public boolean isQuitarHechizo() {
        return quitarHechizo;
    }
}
