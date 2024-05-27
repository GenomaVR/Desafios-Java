//Registrar en un array las notas de un grupo de N estudiantes, estas
//serán ingresadas por el usuario una por una hasta que se ingrese -1
//o hasta que se hayan ingresado 15 notas como máximo.
//Te pedimos determinar cuántos estudiantes aprobaron (nota > 4),
//de éstos cuántos deben presentar TP (nota >= 7) y cuántos rinden
//escrito (nota <7) y cuántos desaprobaron.

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // crear array ara almacenar estudiantes
        int [] notas = new int[15];

        //  array para contar los estudiantes en cada seccion
        int aprobados = 0;
        int tp = 0;
        int escrito = 0;
        int desaprobaron = 0;


        // solicitar ingreso de notas

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Ingresar nota del estudiante " + (i + 1) + "(o ingrese -1 para terminar): ");
                int nota = sc.nextInt();
                    if (nota == -1) {
                        System.out.println("Saliendo");
                        break;
                    }

                    // contar cuantos estudiantes aprobaron

                    if(nota > 4) {
                        aprobados++;
                        if (nota >= 7) {
                            tp++;
                        }else{
                            escrito++;
                        }
                    }else{
                        desaprobaron++;
                    }
                notas[i] = nota;

            }

        System.out.println("Estudiantes que aprobaron: " + aprobados);
        System.out.println("Estudiantes que aprobaron y deben presentar TP: " + tp);
        System.out.println("Estudiantes que aprobaron y deben rendir escrito: " + escrito);
        System.out.println("Estudiantes que desaprobaron: " + desaprobaron);


    }
}



//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Introducir las notas del estudiante : " + (i + 1));
//            notas[i] = sc.nextInt();
//
//                if(notas[i] < 0 || notas[i] > 10){
//
//                    System.out.println("Notas fuera de rango favor ingresar una nota correcta");
//                }
//
//            if(notas[i] == -1){
//                System.out.println("saliendo");
//                break;
//            }
//        }