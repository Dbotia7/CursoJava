import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Domicilio cliente1Domicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);

        Cliente cliente1 = new Cliente.Builder(1, "Carlos Pérez")
                .domicilio(cliente1Domicilio)
                .rfc("RFC001")
                .telefono("555-1234")
                .fechaNacimiento("01-01-1980")
                .build();

        // Crear un Cliente con solo los atributos obligatorios
        Cliente cliente2 = new Cliente.Builder(2, "Ana García")
                .build();

        Cuenta cuentaCheque1 = new CuentaCheque(101, 5000, 3.0);
        Cuenta cuentaAhorro1 = new CuentaAhorro(102, 3000, 1.5);

        Cuenta cuentaCheque2 = new CuentaCheque(103, 7000, 3.0);
        Cuenta cuentaAhorro2 = new CuentaAhorro(104, 10000, 2.0);


        cliente1.agregarCuenta(cuentaCheque1);
        cliente1.agregarCuenta(cuentaAhorro1);

        cliente2.agregarCuenta(cuentaCheque2);
        cliente2.agregarCuenta(cuentaAhorro2);
        cliente1.mostrarInformacionCliente();
        cliente2.mostrarInformacionCliente();


    }
}