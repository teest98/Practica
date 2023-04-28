
package com.mycompany.ejemplo3;

public class Ejemplo3 {

    public static void main(String[] args) {
        int x, y;
        double r;
        Punto punto = new Punto();
        x=20;
        y=35;
        punto.setPunto(x, y);
        System.out.println( punto.toString());
        
        Circulo c = new Circulo();
        Cilindro d = new Cilindro();
        r=8;
        
        c.setRadio(r);
        d.setRadio(r);
        System.out.println(c );
        System.out.println("Circulo " );
        System.out.println( "Area: "+c.area());
        System.out.println( "Perimetro: "+c.perimetro());
    
        System.out.println("Cilindro " );
        System.out.println( "Area: "+d.area());
        
    }
}
