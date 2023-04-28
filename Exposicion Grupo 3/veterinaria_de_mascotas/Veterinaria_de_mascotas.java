
package veterinaria_de_mascotas;

import javax.swing.JOptionPane;

public class Veterinaria_de_mascotas {

    
                public static String Dueño="";
                public static String Tipo_animal="";
                public static String Nombre="";
                public static String Raza="";
                public static String Sintomas="";
                public final static String G="GATO";
                public final static String P="PERRO";
                private static int N=0;
 
        
    public static void main(String[] args) {
      // seleccionar mascota
      
        Dueño=JOptionPane.showInputDialog(null,"INGRESE EL DUEÑO DE LA MASCOTA");
        Nombre=JOptionPane.showInputDialog(null,"INGRESE EL NOMBRE DE LA MASCOTA");
        Raza=JOptionPane.showInputDialog(null,"INGRESE LA RAZA DE LA MASCOTA");
Animal1 abrir=new Animal1();
 
 String Opcion_animal=JOptionPane.showInputDialog(null,"Elija la una opcion \n 1.-Perro \n 2.Gato");
       int OA=Integer.parseInt(Opcion_animal);
 if(OA==1){
             JOptionPane.showMessageDialog(null, "Usted Eligio un "+ P);  

N=Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS SINTOMAS FUERON DETECTADOS EN LA MASCOTA?"));    
         for(int i=1;i<=N;i+=1){
         Sintomas=JOptionPane.showInputDialog(null,"INGRESE EL SINTOMAS "+i); 
          abrir.Animal1();}
         
   Diagnostico abrir1=new Diagnostico();
   abrir1.Diagnostico();
   abrir1.recomendacion();
   abrir1.R();}
 
 
 else{
              JOptionPane.showMessageDialog(null, "Usted Eligio un "+ G);  

N=Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS SINTOMAS FUERON DETECTADOS EN LA MASCOTA?"));    
         for(int i=1;i<=N;i+=1){
         Sintomas=JOptionPane.showInputDialog(null,"INGRESE EL SINTOMAS "+i); 
          abrir.Animal1();}
         
   Diagnostico abrir1=new Diagnostico();
   abrir1.Diagnostico();
   abrir1.recomendacion();
 abrir1.R();}
             
}}
