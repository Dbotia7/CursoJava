//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mayor10 {
    public static void main(String[] args) {
        int[] numeros = {15, 12, 3, 8, 9, 22, 1, 15, 7, 30};
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                contador++;
            }
        }

        System.out.println("Cantidad de números mayores que 10: " + contador);
        }
    }
