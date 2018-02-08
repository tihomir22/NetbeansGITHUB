/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07agenda;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Tema07Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar ahoraCalendar = Calendar.getInstance();
        Scanner teclado = new Scanner(System.in);
        Agenda agenda1 = null;
        Pagina pagina1 = new Pagina();
        Cita cita1 = new Cita();
        int hora, minutos, dia, mes, año, opcion;
        String texto, titulo;

        System.out.println("Introduce año de la agenda");
        año = teclado.nextInt();
        agenda1 = new Agenda(año);
        System.out.println("La agenda fue creada " + agenda1.getAnyo());

        do {
            System.out.println("Introduzca opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    //Añadir los metodos para validar que el dia y el mes son correctos
                    System.out.println("Introduce dia");
                    dia = teclado.nextInt();
                    System.out.println("Introduce mes");
                    mes = teclado.nextInt();
                    agenda1.abierta = agenda1.buscarPagina(dia, mes);
                    System.out.println("Pagina seleccionada : " + agenda1.abierta.getDia() + " " + agenda1.abierta.getMes());
                    break;
                case 2:
                    //Falta añadir metodos de validacion de hora y minuts
                    System.out.println("Introduce hora");
                    hora = teclado.nextInt();
                    System.out.println("Introduce minutos");
                    minutos = teclado.nextInt();
                    System.out.println("Introduce titulo");
                    teclado.nextLine();
                    titulo = teclado.nextLine();
                    System.out.println("Introduce texto");
                    texto = teclado.nextLine();
                    //Comprobar si existe ya una cita a esa hora
                    cita1 = new Cita(hora, minutos, titulo, texto);
                    agenda1.abierta.añadirCita(cita1);
                    agenda1.abierta.leerPagina();
                    break;
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("Elige opcion");
    }

}
