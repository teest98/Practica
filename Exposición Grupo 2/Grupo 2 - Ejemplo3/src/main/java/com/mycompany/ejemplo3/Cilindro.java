
package com.mycompany.ejemplo3;

public class Cilindro extends Circulo {
    private double altura;
    
    public Cilindro(){
        
    }
    
    public double getAltura(){
        return altura;
    }
    
    @Override
    public double area(){

        return(2*Math.PI*super.getRadio()*(super.getRadio()+altura));
    }
    
    public double volumen(){
        return (Math.PI*super.getRadio()*altura);
        
    }
    
}
