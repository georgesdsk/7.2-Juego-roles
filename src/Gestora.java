import Enums.Arma;
import Enums.Hechizo;
import Enums.Profesion;
import Enums.Raza;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;
import  java.util.Scanner;

public class Gestora {

    Validaciones validaciones= new Validaciones();

    public void mostrarPersonaje(ArrayList<Personaje> personajes){

        int contador = 0;

        System.out.println("\t nombre | raza | arma | hechizo | vida");

        for (Personaje p: personajes
             ) {

            System.out.println(contador++ +")\t"+ p.toString());

        }
    }

    public Personaje elegirPersonaje(ArrayList<Personaje> personajes){//Elige a un personaje de todos

        int numeroPersonaje;
        Personaje personaje;

        System.out.println("Selecciona el numero del personaje");
        mostrarPersonaje(personajes);
        numeroPersonaje = validaciones.numeroEntre(0,personajes.size());

        return personaje = personajes.get(numeroPersonaje);

    }


    public void atacarPersonaje(Arma arma, ArrayList<Personaje> personajes){

        System.out.println("Elige al personaje al que quieres atacar");
        Personaje personajeAtacar = elegirPersonaje(personajes);

        personajeAtacar.recibirDanio(arma);

    }


    public void enviarHechizo(Hechizo hechizo, ArrayList<Personaje> personajes){

        System.out.println("Elige al personaje al que le quieres enviar el hechizo");
        Personaje personajeHechizo = elegirPersonaje(personajes);

        personajeHechizo.recibirHechizo(hechizo);


    }

    public Arma interCambiarArma(Arma arma , ArrayList<Personaje> personajes){

        System.out.println("Elige al personaje al que le quieres intercambiar el arma");
        Personaje personajeCambiar = elegirPersonaje(personajes);

        Arma armaRecibida = personajeCambiar.getArma();
        personajeCambiar.setArma(arma);

        return armaRecibida;


    }

    public void anadirPersonaje(ArrayList<Personaje> personajes){

        Scanner sc = new Scanner(System.in);

         String nombre;
         Raza raza;
         Profesion profesion;
         Hechizo hechizo;
         Arma arma;

        System.out.println("Elige un nombre para tu personaje");
        nombre = sc.nextLine();
        System.out.println("Elige su raza");
        raza = (Raza) elegirCaracteristica(Raza.values());
        System.out.println("Elige el hechizo");
        hechizo = (Hechizo) elegirCaracteristica(Hechizo.values());
        System.out.println("Elige la profesion");
        profesion = (Profesion) elegirCaracteristica(Profesion.values());
        System.out.println("ELigele un arma");
        arma = (Arma) elegirCaracteristica(Arma.values());


        Personaje personaje = new Personaje(nombre,raza,profesion,hechizo,arma);

        personaje.getInfo();



    }



    /*
    Se le pasa un array del cual se eligirá la posicion que se desee

    */

    public Enum elegirCaracteristica(Enum[] enums){

        int eleccion;

        System.out.println("Selecciona el numero de la caracteristica deseada");


        for (int i = 0; i < enums.length ;i++) {

            System.out.println(i+ ") " +enums[i].name());
        }

        eleccion = validaciones.numeroEntre(0, enums.length);

        return enums[eleccion];


    }












}
