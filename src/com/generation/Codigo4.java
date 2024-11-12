package com.generation;
import java.util.Scanner;



public class Codigo4 {

    //Agregar System.in al Scanner
    Scanner s = new Scanner(System.in);

    //Generar el metodo jugar con la logica
    public void jugar(){

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    //Renombramos el jugador 2 a su nombre correcto
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Agregar System.in al Scanner
    String j2 = s.nextLine();

    if (j1.equals(j2)) {
        System.out.println("Empate");
    } else {
        int g = 2;
        switch(j1) {
            //Normalizando los valores a lowercase
            //Modificamos comparador == to equals.
            case "piedra":
                if (j2.toLowerCase().equals("tijeras")) {
                    g = 1;
                }
                break;

            case "papel":
                if (j2.toLowerCase().equals("piedra")) {
                    g = 1;
                }
                break;

                //Desindentamos el case tijeras y cerramos el case papel.
            case "tijeras":
                if (j2.toLowerCase().equals("papel")) {
                    g = 1;
                }
                        break;
                    default:
                        break;
                }
                System.out.println("Gana el jugador " + g);
        }

                //Cerrar el Scanner instanciado
                s.close();

        }


    }


