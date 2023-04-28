
package com.mycompany.ejemplo3;

public class Circulo extends Punto {
    private double radio;
    
    public Circulo(){
        radio=0.0;
        
    }
    
    public void setRadio (double nuevoRadio){
        radio=nuevoRadio;
        
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double area(){
        return (Math.PI * radio * radio);
    }
    
    public double perimetro(){
        return (2*radio*Math.PI);
        
    }
    
    @Override
 public String toString(){
     return "Circulo("+radio+")";
 }
}
