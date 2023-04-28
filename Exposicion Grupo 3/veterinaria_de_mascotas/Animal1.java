
package veterinaria_de_mascotas;

import javax.swing.JOptionPane;


public class Animal1 {

     
     //Contador de probabilidad
     public static int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,c12=0;
     String P_enfermedades="";

   public static String [ ] Enfermedad = {"Vomitos","Diarrea","Enfermedades del corazon","Distemper","Enfermedades Autoinmunitarias","Perdida de Peso",
                             "Enfermedad Renal","Diabetes","Perdida de Pelo","Descamacion","Problemas de Comportamiento","Parvovirus"};
   
   public void Animal1(){
        
     //sintomas   
    String sintoma=Veterinaria_de_mascotas.Sintomas;
    String s1="infeccion";
    String s2="alergia";
    String s3="parasito";
    String s4="gastroentestinal";        
    String s5="tos";
    String s6="problema digestivo";        
    String s7="picazon";        
    String s8="enrojecimiento";
    String s9="dolor cronico";
    String s10="ansiedad";
    String s11="moquillo";
         
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s3)|| sintoma.equals(s4)){
     P_enfermedades=P_enfermedades+ Enfermedad[0]; 
     c1=c1+1;}
     
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s3)|| sintoma.equals(s4)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[1];
      c2=c2+1;}
     
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s5)|| sintoma.equals(s8)||
        sintoma.equals(s9)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[2];
      c3=c3+1;}     
    
     if(sintoma.equals(s5)||sintoma.equals(s6)||sintoma.equals(s9)||sintoma.equals(s11)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[3]; 
      c4=c4+1;}
     
     if(sintoma.equals(s1)|| sintoma.equals(s2)|| sintoma.equals(s5)||sintoma.equals(s7)||
             sintoma.equals(s8)||sintoma.equals(s10)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[4];
      c5=c5+1;}
     
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s3)||sintoma.equals(s4)||
             sintoma.equals(s6)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[5];
      c6=c6+1;}
     
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s3)||sintoma.equals(s6)||sintoma.equals(s8)||
             sintoma.equals(s9)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[6];
      c7=c7+1;}
     
     if(sintoma.equals(s4)||sintoma.equals(s6)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[7];
      c8=c8+1;} 
     
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s7)||sintoma.equals(s8)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[8];
      c9=c9+1;}
     
     if(sintoma.equals(s1)||sintoma.equals(s2)||sintoma.equals(s7)||sintoma.equals(s8)){
       P_enfermedades=P_enfermedades+ "\n"+Enfermedad[9];  
      c10=c10+1;}
     
     if(sintoma.equals(s10)||sintoma.equals(s6)||sintoma.equals(s2)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[10];
      c11=c11+1;}
     
     if(sintoma.equals(s1)||sintoma.equals(s5)||sintoma.equals(s9)){
     P_enfermedades=P_enfermedades+ "\n"+Enfermedad[11];
     c12=c12+1;}          }

   
    
 
}

    
      
