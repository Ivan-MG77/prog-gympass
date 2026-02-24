public class Gimnasio {

    //Atributos normalmente en PRIVATE
    private String codigo;
    private String nombre;
    private Socio socio[];
    private Sala salas[];

    /**
     * Esta es el METODO CONSTRUCTOR de Sala
     * Normalmente (Siempre) el CONSTRUCTOR es PUBLIC
     * Y no devuelve nada
     * @param codigo
     * @param nombre
     */
    public Gimnasio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }

}
