
package ejemplo_interfaz_1;

 public class Carpintero extends Persona implements IEmpleado
{
    public Carpintero() {
    }
    // -------------------------
     @Override
     public void trabajar() {
        System.out.println( this.getNombreCompleto() + " está realizando trabajos de carpintería");
    }
}
