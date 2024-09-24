import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Domicilio cliente1Domicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);
        Domicilio cliente2Domicilio = new Domicilio("Calle 15 Sur", 54, "Sur", "Itagui", 98765);
        Domicilio cliente3Domicilio = new Domicilio("Carrera 18 C", 45, "Sur", "La Estrella", 76587);
        Cliente cliente1 = new Cliente(1, "1", cliente1Domicilio, "RFC1", "555-1234", "01-01-1990");
        Cliente cliente2 = new Cliente(2, "2", cliente2Domicilio, "RFC2", "555-5678", "02-02-1991");
        Cliente cliente3 = new Cliente(3, "3", cliente3Domicilio, "RFC3", "555-8765", "03-03-1992");

        //Paso 2: Identificar el archivo, Leer el archivo, Insertar los datos
        String nombreArchivo = "src/cuentas.txt";
        List<String> lineas = leerArchivo(nombreArchivo);

        for (String linea : lineas) {
            String[] partes = linea.split(",");
            int clienteID = Integer.parseInt(partes[4]);
            int numeroCuenta = Integer.parseInt(partes[0]);
            double saldo = Double.parseDouble(partes[2]);
            double costoManejo = Double.parseDouble(partes[3]);
            double tasaInteresMensual = Double.parseDouble(partes[3]);

            CuentaCheque cuentaCheque = new CuentaCheque( numeroCuenta, saldo, costoManejo);
            CuentaAhorro cuentaAhorro = new CuentaAhorro( numeroCuenta, saldo, tasaInteresMensual);

            switch (clienteID) {
                case 1 -> cliente1.agregarCuenta(cuentaCheque);
                case 2 -> cliente2.agregarCuenta(cuentaAhorro);
                case 3 -> cliente3.agregarCuenta(cuentaCheque);
                default -> System.out.println("Cliente no válido: " + clienteID);
            }
        }

        mostrarInformacionCliente(cliente1, 1);
        mostrarInformacionCliente(cliente2, 2);
        mostrarInformacionCliente(cliente3, 3);
    }

    public static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }

    public static void mostrarInformacionCliente(Cliente cliente, int cantidadEsperada) {
        cliente.mostrarInformacionCliente();
        if (cliente.getCuentas().size() == cantidadEsperada) {
            System.out.println("Cliente " + cliente.getNumero() + " tiene la cantidad correcta de cuentas.");
        } else {
            System.out.println("Error: Cliente " + cliente.getNumero() + " debería tener " + cantidadEsperada + " cuentas, pero tiene " + cliente.getCuentas().size() + ".");
        }
    }

    }
}