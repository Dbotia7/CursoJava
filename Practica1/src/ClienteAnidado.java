import java.util.ArrayList;
import java.util.List;

public class ClienteAnidado implements ServicioCuentas , Comparable<ClienteAnidado> {
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private final List<Cuenta> cuentas;
    private String fechaNacimiento;


    //Constructor
    private ClienteAnidado(Builder builder) {
        this.numero = builder.numero;
        this.nombre = builder.nombre;
        this.domicilio = builder.domicilio;
        this.rfc = builder.rfc;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }
    // Getters
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static class Builder {
        private final int numero;
        private final String nombre;
        private Domicilio domicilio;
        private String rfc;
        private String telefono;
        private String fechaNacimiento;

        public Builder(int numero, String nombre) {
            this.numero = numero;
            this.nombre = nombre;
        }

        public Builder domicilio(Domicilio domicilio) {
            this.domicilio = domicilio;
            return this;
        }

        public Builder rfc(String rfc) {
            this.rfc = rfc;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder fechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public ClienteAnidado build() {
            return new ClienteAnidado(this);
        }
    }
    public void mostrarInformacionCliente() {
        System.out.println("---------- Informacion de Cliente ----------");
        System.out.println("Nombre Cliente: " + nombre);
        System.out.println("Numero Cliente: " + numero);
        System.out.println("Domicilio Cliente: " + domicilio);
        System.out.println("Rfc Cliente: " + rfc);
        System.out.println("Telefono Cliente: " + telefono);
        System.out.println("Fecha de Nacimiento Cliente: " + fechaNacimiento);
        System.out.println("------------------------------------------");


    }
    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta agregada: " + cuenta.getNumero());
        return true;
    }
    @Override
    public boolean cancelarCuenta(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numeroCuenta) {
                // Establecemos una fecha de cancelación
                cuenta.setFechaCancelacion("16-09-2024"); // Se podría usar la fecha actual
                System.out.println("Cuenta cancelada: " + numeroCuenta);
                return true;
            }
        }
        System.out.println("Cuenta no encontrada: " + numeroCuenta);
        return false;
    }
    @Override
    public void abonarCuenta(int numeroCuenta, double monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numeroCuenta) {
                cuenta.setSaldo(cuenta.getSaldo() + monto);
                System.out.println("Se abonaron " + monto + " a la cuenta: " + numeroCuenta);
                return;
            }
        }
        System.out.println("Cuenta no encontrada: " + numeroCuenta);



    }
    @Override
    public void retirarCuenta(int numeroCuenta, double monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numeroCuenta) {
                if (cuenta.getSaldo() >= monto) {
                    cuenta.setSaldo(cuenta.getSaldo() - monto);
                    System.out.println("Se retiraron " + monto + " de la cuenta: " + numeroCuenta);
                } else {
                    System.out.println("Saldo insuficiente en la cuenta: " + numeroCuenta);
                }
                return;
            }
        }
        System.out.println("Cuenta no encontrada: " + numeroCuenta);
    }
    @Override
    public List<Cuenta> obtenerCuentas() {
        return cuentas;
    }

    @Override
    public int compareTo(ClienteAnidado cliente) {
        return Integer.compare(this.numero, cliente.numero);
    }



}
