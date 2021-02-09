

import java.util.Scanner;

public class Validaciones {

    Scanner sc = new Scanner(System.in);


    public int numeroEntre(int min, int max) {

        int respuesta = sc.nextInt();

        while (respuesta < min || respuesta > max) {
            System.out.println("El numero debe de estar entre " + min + " y " + max);
            respuesta = sc.nextInt();
        }

        return respuesta;
    }
}


