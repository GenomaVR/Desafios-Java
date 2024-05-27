//Se realiza una encuesta a 15 personas sobre la calificación (de 1 a 5)
//que le dan a dos productos A y B que compiten en el mercado.
//Registrar las calificaciones de A y B en dos arrays (generar las
//calificaciones aleatoriamente), y a continuación determinar cuál es
//el producto que tiene más preferencia por la gente en base a los
//promedios. Imprimir por pantalla los resultados.
//Ejemplo:
//Datos: A = {2,1,5,.....,2} y B = {4,3,5,.....,3}
//Salida: “El promedio de A es 20.3 y el de B es 24.7.
//A es el producto preferido por la gente”

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;




public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear arrays para las calificaciones de los productos A y B

            int [] calificacionA = new int[15];
            int [] calificacionB = new int[15];
            double promedioA = 0;
            double promedioB = 0;



           // generamos aleatorio al producto a y b
            Random rand = new Random();
            for(int i = 0; i < calificacionA.length; i++) {
                calificacionA[i] = rand.nextInt(5)+1;
                promedioA += calificacionA[i];
            }

            for(int i = 0; i < calificacionB.length; i++) {
                calificacionB[i] = rand.nextInt(5)+1;
                promedioB += calificacionB[i];
            }

            double calculoA = promedioA / calificacionA.length;
            double calculoB = promedioB / calificacionB.length;

            //Promedio de notas

            if(calculoA > calculoB) {
                System.out.println("El promedio de A es de: "+calculoA+ " y el promedio de B es de: " + calculoB);
                System.out.println("El producto elegido por la gente es el producto A ");
            }else if (calculoA < calculoB) {
                System.out.println("El promedio de A es de: "+calculoA+ " y el promedio de B es de: " + calculoB);
                System.out.println("El producto elegido por la gente el producto B");
            }else {
                System.out.println("El promedio de A es de: "+calculoA+ " y el promedio de B es de: " + calculoB);
                System.out.println("Los productos tienen el mismo promedio.");
            }



            System.out.println(Arrays.toString(calificacionA));
            System.out.println(Arrays.toString(calificacionB));
    }
}

