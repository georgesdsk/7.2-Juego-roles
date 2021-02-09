package Interfaces;

import Enums.Arma;
import Enums.Hechizo;

public interface PersonajeINT {

    public void recibirDanio(Arma arma);

    public void recibirHechizo(Hechizo hechizo);

    public void setHechizo(Hechizo hechizo);

    public void setArma(Arma arma);

    public Arma getArma();

    public Hechizo getHechizo();

    public boolean isVivo();

    public double getVida();
    public int getDestreza();
    public int getInteligencia();
    public void getInfo();




}
