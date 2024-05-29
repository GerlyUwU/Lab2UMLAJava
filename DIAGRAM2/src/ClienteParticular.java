public class ClienteParticular extends Cliente {

    private String tarjeta;

    public ClienteParticular(String tarjeta, String nombre) {
        super(nombre);
        this.tarjeta = tarjeta;
    }

}
