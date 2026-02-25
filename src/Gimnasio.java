public class Gimnasio {

    //Atributos normalmente en PRIVATE
    private String codigo;
    private String nombre;
    private Socio[] listaSocios;
    private Sala[] listaSalas;
    private int responsableId;

    public final int MAX_Socios;
    public final int MAX_Salas;


    /**
     * Esta es el METODO CONSTRUCTOR de Sala
     * Normalmente (Siempre) el CONSTRUCTOR es PUBLIC
     * Y no devuelve nada
     * @param codigo
     * @param nombre
     */
    public Gimnasio(String codigo, String nombre, int cantidadMaxSocios, int cantidadMaxSalas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.MAX_Socios = cantidadMaxSocios;
        this.MAX_Salas = cantidadMaxSalas;

        this.listaSocios = new Socio[MAX_Socios];
        this.listaSalas = new Sala[MAX_Salas];

        this.responsableId = -1;
    }


    //GESTION DE SOCIOS

    public boolean registrarSocio(Socio socio) {
        boolean resultadoRegistrado = false;

        if(existeSocio() !=   ) {


        }
        return resultadoRegistrado;
    }

    public Socio expulsarSocio(int numeroSocio) {

    }

    public boolean existeSocio() {
        boolean resultadoExiteSocio = false;

        for (int i = 0; i < MAX_Socios && !resultadoExiteSocio; i++ ) {
            if (this.listaSocios[i] != null){
                resultadoExiteSocio = true;
            }
        }
        return resultadoExiteSocio;
    }

    public boolean designarResponsable(int numeroSocio){

    }


    //GESTION DE SALAS

    public boolean incorporarSala(Sala sala){

    }

    //RESUMEN
    public String obtenerInforme(){

    }




}
