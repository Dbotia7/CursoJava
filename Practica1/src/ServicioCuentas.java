import java.util.ArrayList;
import java.util.List;

public interface ServicioCuentas {
    // Método para agregar una nueva cuenta
    boolean agregarCuenta(Cuenta cuenta);
    // Método para cancelar una cuenta
    boolean cancelarCuenta(int numero);
    // Método para abonar a una cuenta
    void abonarCuenta(int numeroCuenta, double abono);
    // Método para retirar de una cuenta
    void retirarCuenta(int numeroCuenta, double retiro);
    // Método para obtener las cuentas asociadas
    List<Cuenta> obtenerCuentas();
}
