//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NumMax {
    public static void main(String[] args) {

        int[] numeros = {27, 5, 83, 42, 19, 76, 34, 58, 91, 13};
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El número más grande es: " + maximo);
        }
    }
