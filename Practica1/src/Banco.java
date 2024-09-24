import java.util.ArrayList;

public class Banco implements ServicioClientes{
    private String nombre;

    private Domicilio domicilio;

    private String rfc;

    private String telefono;

    private final ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {

        this.nombre = nombre;

        this.domicilio = domicilio;

        this.rfc = rfc;

        this.telefono = telefono;

        this.clientes = new ArrayList<>();

    }

    public void adicionarCliente(Cliente cliente) {

        clientes.add(cliente);

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public Domicilio getDomicilio() {

        return domicilio;

    }

    public void setDomicilio(Domicilio domicilio) {

        this.domicilio = domicilio;

    }

    public String getRfc() {

        return rfc;

    }

    public void setRfc(String rfc) {

        this.rfc = rfc;

    }

    public String getTelefono() {

        return telefono;

    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;

    }

    public ArrayList<Cliente> getClientes() {

        return clientes;

    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getNumero() == cliente.getNumero()) {
                // Si ya existe un cliente con el mismo número, no lo agrega
                System.out.println("El cliente ya existe: " + cliente.getNumero());
                return false;
            }
        }
        clientes.add(cliente);
        System.out.println("Cliente agregado: " + cliente.getNumero());
        return true;
    }
    @Override
    public boolean eliminarCliente(int numeroCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == numeroCliente) {
                clientes.remove(cliente);
                System.out.println("Cliente eliminado: " + numeroCliente);
                return true;
            }
        }
        System.out.println("Cliente no encontrado: " + numeroCliente);
        return false;
    }
    @Override
    public Cliente consultarCliente(int numeroCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == numeroCliente) {
                System.out.println("Cliente encontrado: " + cliente.getNumero());
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado: " + numeroCliente);
        return null;
    }
    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }
    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        for (Cliente cliente : clientes) {
            if (cliente.getRfc().equals(rfc)) {
                System.out.println("Cliente encontrado por RFC: " + rfc);
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado por RFC: " + rfc);
        return null;
    }


}
