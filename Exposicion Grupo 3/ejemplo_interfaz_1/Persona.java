
package ejemplo_interfaz_1;
public class Persona
{
    private String nombreCompleto;
    // -------------------------
    public Persona() {
    }
    // -------------------------
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    // -------------------------
    public void setNombreCompleto( String nombreCompleto ) {
        this.nombreCompleto = nombreCompleto;
    }
}