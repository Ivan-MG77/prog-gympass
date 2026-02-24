public class Socio {

    /**
     * Creamos los atrivutos de la clase Socio correspondientes
     */
    private int numeroSocio;
    private String nombre;

    /**
     * Metodo Constructor de la Clase de Socio
     * Normalmente (Siempre) el CONSTRUCTOR es PUBLIC
     * @param numeroSocio
     * @param nombre
     */
    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
    }

    /**
     * Estos son los Gets de la Clase Sala
     * Los ponemos en PUBLIC para que se pueda acceder a ellas desde otras Clases
     * @return this.
     */
    public int getNumeroSocio() {
        return this.numeroSocio;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     * Esto es un toString que sirve para pasar datos a String
     * @return Devuelve la concatenacion de los datos de Sala tod0 junto en un String
     */
    @Override
    public String toString() {
        return "NUMERO-SOCIO:" + this.numeroSocio + " NOMBRE:" + this.nombre;
    }
}