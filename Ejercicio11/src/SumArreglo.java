//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumArreglo {
    public static void main(String[] args) {
        int[] numeros = {23, 57, 14, 89, 42};
        int suma = 0;


        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }


        System.out.println("La suma de los elementos del Arreglo es: " + suma);
        }
    }
