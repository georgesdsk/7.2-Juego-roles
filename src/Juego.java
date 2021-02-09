

import Enums.Hechizo;

import java.util.ArrayList;

public class Juego {

    public static void main(String[] args) {

        ArrayList<Personaje> Personajes = new ArrayList<Personaje>();
        Personaje personajeSeleccionado;
        Gestora gestora = new Gestora();
        Validaciones validaciones = new Validaciones();


        do {




            System.out.println("Desea seguir? 0 = no, 1 = si");

        }while(validaciones.numeroEntre(0,1) == 1);


        gestora.anadirPersonaje(Personajes);


    }



}
