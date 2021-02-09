import Enums.Arma;
import Enums.Hechizo;
import Enums.Profesion;
import Enums.Raza;

public class Personaje implements Interfaces.PersonajeINT {

    private String nombre;
    private Raza raza;
    private Profesion profesion;
    private Hechizo hechizo;
    private Arma arma;
    private double vida;
    private boolean vivo;
    private String[] nombres = new String[]{"Pepe" ,"Paco", "Pablito", "Lauro","Eugenio", "Lauri"};

/////////////////////////////////////////////////////////////////Constructores
    public Personaje(String nombre, Raza raza, Profesion profesion, Hechizo hechizo, Arma arma) {
        this.nombre = nombre;
        this.raza = raza;
        this.profesion = profesion;
        this.hechizo = hechizo;
        this.arma = arma;
        this.vida = raza.getVida();
        this.vivo = true;
    }

    public Personaje() {
        this.nombre = "nombre";
        this.raza = Raza.MAGO;
        this.profesion = Profesion.ALQUIMISTA;
        this.hechizo = Hechizo.BOLA_FUEGO;
        this.arma = Arma.BALLESTA;
        this.vida = raza.getVida();
        this.vivo = true;
    }


    /*
    Si tiene la vida por debajo de 0, esta muerto
     */

    private boolean viviendo(){

        if (vida <= 0) {

            vivo = false;
            System.out.println("El personaje " +this.nombre + " esta muerto.");
        }

        return vivo;
    }


    /*
    Dependiendo de la raza y del arma va a ser un danio diferente
     */

    @Override
    public void recibirDanio(Arma arma) {

        double danio;

        if (viviendo()){

          danio= raza.getDanioPorGolpe() * arma.getDanio();
          this.vida -=  danio;
            System.out.println("Has recibido " +danio +" de danio y te quedas con "+this.vida+ " de vida");

        }

    }

    @Override
    public void recibirHechizo(Hechizo hechizo) {

        double danio;

        if (viviendo()){

            System.out.print("Hechizo de " +hechizo.name()+ ":");

            if (hechizo.isQuitarHechizo()){
                this.hechizo = Hechizo.NADA;
                System.out.println(" te ha quitado tu hechizo");
            }

            if (hechizo.isQuitarArma()){
                this.arma = Arma.NADA;
                System.out.println(" te ha quitado tu arma");
            }

            danio = hechizo.getDanio();
            this.vida -=danio;
            System.out.println(+danio+ " de danio y te has quedado con "+ this.vida);

        }

    }

    @Override
    public void setHechizo(Hechizo hechizo) {

        this.hechizo = hechizo;

    }

    @Override
    public void setArma(Arma arma) {

        this.arma = arma;
    }

    @Override
    public Arma getArma() {
        return arma;
    }

    @Override
    public Hechizo getHechizo() {
        return this.hechizo;
    }

    @Override
    public boolean isVivo() {
        return vivo;
    }

    @Override
    public double getVida() {
        return vida;
    }

    @Override
    public int getDestreza() {

        return raza.getDestreza();
    }

    @Override
    public int getInteligencia() {
        return raza.getInteligencia();
    }

    @Override
    public void getInfo() {

        if (viviendo()) {
            System.out.println("El " + this.nombre + " de la especie " + this.raza + " tiene un/a " + this.arma + " como arma, "
            +this.hechizo + " como hechizo y "+ this.vida+ " de vida");
        }

    }

    @Override
    public String toString(){

        String mensaje = " ";

        if (viviendo()){
            mensaje = this.nombre + " | " + this.raza + " | " + this.arma + " | " +
                    this.hechizo + " | "+ this.vida;
        }
            return mensaje;
    }

}
