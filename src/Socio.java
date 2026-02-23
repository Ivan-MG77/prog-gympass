public class Socio {

    private int numeroSocio;
    private String nombre;

    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return this.numeroSocio;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "NUMERO-SOCIO:" + this.numeroSocio + " NOMBRE:" + this.nombre;
    }
}