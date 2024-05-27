import java.util.Arrays;
import java.util.Scanner;

//Pedí al usuario que ingrese una serie de 10 números (uno por uno).
//Registrar los números en un array.
//A continuación, calcular el promedio de los números ingresados (sin
//incluir el número negativo) y mostrarlo en pantalla, junto con el
//array.
//Desarrollá el diagrama y luego escribí en Java.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //-------------------------------///---------------------------
        ////Pedí al usuario que ingrese una serie de 10 números (uno por uno).
        ////Registrar los números en un array.

        System.out.println("Ingrese 10 numeros");

        // Pedir al usuario que ingrese 10 numeros 1 x 1 en array
        double numeros[] = new double[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite un numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Los numeros ingresados son:" + Arrays.toString(numeros));

        ////////////-------------------------------------------------------

        // Calcular el promedio de los números ingresados (sin incluir el número negativo)

        double suma = 0;
        int cantidadPositivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            double num = numeros[i];
                if (num >= 0) {
                    suma = suma + num;
                    cantidadPositivos++;
                }
        }

        /// calculo promerio
        double promedio;
        if (cantidadPositivos > 0) {
            promedio = suma / cantidadPositivos;
        }else {
            promedio = 0;
        }

        System.out.println("El promedio es: " + promedio);




    }
}
