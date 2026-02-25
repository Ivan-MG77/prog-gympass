public class Sala {

    /**
     * Creamos los 2 atributos obligatorios que tiene que tener esta clase
     */
    private int codigoSala;
    private String descripcion;

    /**
     * Esta es el METODO CONSTRUCTOR de Sala
     * Normalmente (Siempre) el CONSTRUCTOR es PUBLIC
     * @param codigoSala
     * @param descripcion
     */
    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    /**
     * Estos son los Gets de la Clase Sala
     * Los ponemos en PUBLIC para que se pueda acceder a ellas desde otras Clases
     * @return this.
     */
    public int getCodigoSala() {
        return this.codigoSala;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Esto es un toString que sirve para pasar datos a String
     * @return Devuelve la concatenacion de los datos de Sala tod0 junto en un String
     */
    @Override
    public String toString() {
        return "COD Sala: " + this.codigoSala + ": " + this.descripcion;
    }

}