public class ClienteCorporativo extends Cliente {

    private String cuenta;

    public ClienteCorporativo(String cuenta, String nombre) {
        super(nombre);
        this.cuenta = cuenta;
    }

}
