
package ejemplo_interfaz_1;
public class Main
{
    public static void main(String[] args)
    {
        Carpintero c = new Carpintero();
        Fontanero f = new Fontanero();
        c.setNombreCompleto("Pedro Pérez Perera");
        c.trabajar();
        f.setNombreCompleto("Antonio Miranda Mena");
        f.trabajar();
    }
}
