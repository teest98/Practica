
package veterinaria_de_mascotas;

import javax.swing.JOptionPane;

public class Diagnostico extends Recomendacion{

     private String Reco="";
public void Diagnostico(){






                
      String [ ] cantidad = {null,null,null,null,null,null,null,null,null,null,null};
  
        int C1=Animal1.c1,C2=Animal1.c2,C3=Animal1.c3,C4=Animal1.c4,C5=Animal1.c5,C6=Animal1.c6,C7=Animal1.c7,C8=Animal1.c8,C9=Animal1.c9,
        C10=Animal1.c10,C11=Animal1.c11;
            if(C1!=0){cantidad[0]="TIENE "+C1+" de posibilidades de contener "+Animal1.Enfermedad[0];}
            if(C2!=0){cantidad[1]="\n TIENE "+C2+" de posibilidades de contener "+Animal1.Enfermedad[1];}
            if(C3!=0){cantidad[2]="\n TIENE "+C3+" de posibilidades de contener "+Animal1.Enfermedad[2];}
            if(C4!=0){cantidad[3]="\n TIENE "+C4+" de posibilidades de contener "+Animal1.Enfermedad[3];}
            if(C5!=0){cantidad[4]="\n TIENE "+C5+" de posibilidades de contener "+Animal1.Enfermedad[4];}
            if(C6!=0){cantidad[5]="\n TIENE "+C6+" de posibilidades de contener " +Animal1.Enfermedad[5];}
            if(C7!=0){cantidad[6]="\n TIENE "+C7+" de posibilidades de contener "+Animal1.Enfermedad[6];}
            if(C8!=0){cantidad[7]="\n TIENE "+C8+" de posibilidades de contener "+Animal1.Enfermedad[7];}
            if(C9!=0){cantidad[8]="\n TIENE "+C9+" de posibilidades de contener "+Animal1.Enfermedad[8];}
            if(C10!=0){cantidad[9]="\n TIENE "+C10+" de posibilidades de contener "+Animal1.Enfermedad[9];}
            if(C11!=0){cantidad[10]="\n TIENE "+C11+" de posibilidades de contener "+Animal1.Enfermedad[10];}
           
            String D="";
            for(int i=0;i<=10;i+=1){
                if(cantidad[i]!=null){D=D+cantidad[i];}}
            
          JOptionPane.showMessageDialog(null, "POSIBLES CAUSAS DE ENFERMEDAD: "+D);  
        
    //identifica el mayor
        int numeros[] = {C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11};
        int mayor = numeros[0];//Suponemos que el mayor es el primero
        // Ciclo comienza en 1 porque el 0 ya está contemplado
        for (int x = 1; x < numeros.length; x++) {
            int numeroActual = numeros[x];
            if (numeroActual > mayor) {
                mayor = numeroActual;
            }
        }

if(mayor==C1){Reco=Reco+"\n RECOMENDACION PARA VOMITOS\n"
 + "1.- Ayunar: Si tu perro ha estado vomitando, es posible que quieras ayunarle durante 12-24 horas para \n"
        + "darle a su sistema digestivo la oportunidad de descansar. Asegúrate de proporcionarle agua limpia\n"
        + " y fresca en todo momento para evitar la deshidratación.\n" +
"\n" +
"2.- Dieta blanda: Una vez que tu perro ha ayunado durante un período de tiempo adecuado, puedes comenzar a \n"
        + "reintroducir alimentos en su dieta. Una buena opción es una dieta blanda, que puede incluir alimentos \n"
        + "como pollo hervido, arroz blanco y caldo de pollo bajo en sodio.\n" +
"\n" +
"3.- Pequeñas porciones: Es posible que desees alimentar a tu perro con porciones más pequeñas y frecuentes en \n"
        + "lugar de una o dos grandes comidas al día. Esto puede ayudar a prevenir que su estómago se sobrecargue \n"
        + "y disminuir las posibilidades de vomitar.\n" +
"\n" +
"4.- Descanso: Dale a tu perro mucho descanso y evita el ejercicio vigoroso o el estrés. Esto puede ayudar a\n"
        + " disminuir las posibilidades de que vomite.";}

if(mayor==C2){Reco=Reco+"\n RECOMENDACION PARA DIARREA\n}"
        + "1.- Proporcione agua fresca y limpia en todo momento para prevenir la deshidratación.\n" +
"\n" +
"2.- Mantenga a su perro en un lugar donde pueda acceder fácilmente a una zona de eliminación.\n" +
"\n" +
"3.- Aliméntelo con una dieta suave y fácil de digerir, como arroz cocido y pollo sin piel. Evite la comida para \n"
        + "perros que contenga ingredientes difíciles de digerir, como grasas y especias.\n" +
"\n" +
"4.- Evite darle cualquier tipo de hueso, ya que pueden dañar el tracto intestinal de su perro.\n" +
"\n" +
"5.- Considere agregar probióticos o prebióticos a la dieta de su perro para ayudar a equilibrar la flora \n"
        + "intestinal y mejorar la digestión.";}


if(mayor==C3){Reco=Reco+"\n RECOMENDACION PARA ENFERMEDADES DEL CORAZON\n"
        + "Si sospechas que tu perro tiene una enfermedad del corazón, es importante que lo  "
        + "lleves al veterinario para que lo\n examine y diagnostique adecuadamente."
        + " Algunas de las enfermedades del corazón más comunes en perros incluyen \n"
        + "la enfermedad valvular degenerativa, la cardiomiopatía dilatada y la cardiomiopatía hipertrófica.";}


if(mayor==C4){Reco=Reco+"\n RECOMENDACION PARA DISTEMPER\n"
        + " cambies a alimento en lata, más suave y fácil de digerir, y que en el caso de ser necesario \n"
        + "abras el hocico de tu perro y lo alimentes poco a poco.";}

if(mayor==C5){Reco=Reco+"\n RECOMENDACION PARA ENFERMEDADES AUTOINMUNITARIAS\n"
        + "Proporcione una dieta saludable: Una dieta saludable y bien balanceada puede ayudar a mantener el "
        + "sistema inmunológico de su perro en\n buen estado y apoyar su bienestar general. Hable con su veterinario "
        + "sobre la dieta adecuada para su perro.\n" +
"\n" +
"Reduzca el estrés: El estrés puede afectar negativamente la salud del sistema inmunológico de su perro. Trate de "
        + "reducir el estrés en su perro, brindándole\n un ambiente tranquilo y seguro, y asegurándose de que tenga "
        + "suficiente tiempo de juego y ejercicio.\n" +
"\n" +
"Evite los desencadenantes de la enfermedad: Algunas enfermedades autoinmunitarias pueden ser desencadenadas por \n"
        + "ciertos factores ambientales. Trate de evitar los desencadenantes conocidos de la enfermedad de su \n"
        + "perro, si es posible.";}
if(mayor==C6){Reco=Reco+"\n RECOMENDACION PARA LA PERDIDA DE PESO\n"
        + "Asegúrate de que tu perro esté recibiendo suficiente alimento y agua. Asegúrate de que estás alimentando "
        + "a tu perro con la cantidad \nadecuada de comida y agua para su tamaño y nivel de actividad.\n" +
"\n" +
"Proporciona una dieta equilibrada. Asegúrate de que la dieta de tu perro incluya una mezcla de proteínas, carbohidratos "
        + "y \ngrasas, junto con las vitaminas y minerales esenciales para su salud.\n" +
"\n" +
"Considera cambiar la marca de alimentos. Si tu perro está perdiendo peso a pesar de que está recibiendo suficiente comida, "
        + "considera cambiar a una marca de\n alimentos de mayor calidad o una que esté especialmente formulada para "
        + "ayudar a mantener el peso.\n" +
"\n" +
"Aumenta la frecuencia de las comidas. Si tu perro está perdiendo peso porque no está comiendo lo suficiente, considera \n"
        + "dividir su comida diaria en comidas más pequeñas y frecuentes a lo largo del día.\n" +
"\n" +
"Aumenta la actividad física. Asegúrate de que tu perro esté haciendo suficiente ejercicio y actividad física diariamente, \n"
        + "ya que esto ayudará a mantener su peso.\n" +
"";}

if(mayor==C7){Reco=Reco+"\n RECOMENDACION PARA LA ENFERMEDAD RENAL\n"
        + "Agua fresca: Asegúrese de que su perro siempre tenga acceso a agua fresca y limpia. Mantenga el recipiente de "
        + "agua lleno y \ncambie el agua regularmente.\n" +
"\n" +
"Control de peso: Mantenga a su perro en un peso saludable y evite el sobrepeso. El exceso de peso puede aumentar la presión "
        + "sobre los riñones y\n aumentar el riesgo de enfermedad renal.\n" +
"\n" +
"Ejercicio regular: Asegúrese de que su perro haga suficiente ejercicio regularmente. El ejercicio ayuda a mantener un peso"
        + " saludable y reduce el estrés en los riñones.\n" +
"\n" +
"Revisiones regulares: Lleve a su perro a revisión veterinaria regularmente. Los chequeos regulares pueden ayudar a detectar "
        + "cualquier problema renal en \nsus primeras etapas, lo que aumenta las posibilidades de un tratamiento efectivo.\n" +
"\n" +
"Evite sustancias tóxicas: Mantenga a su perro alejado de sustancias tóxicas como pesticidas, productos de limpieza y plantas "
        + "venenosas. \nEstos productos pueden dañar los riñones de su perro y aumentar el riesgo de enfermedad renal.\n" +
"";}


if(mayor==C8){Reco=Reco+"\n RECOMENDACION PARA LA DIABETES \n"
        + "Mantener una dieta equilibrada: Alimente a su perro con alimentos de alta calidad y evite los alimentos altos en "
        + "carbohidratos y azúcares.\n Considere cambiar a una dieta baja en carbohidratos si su perro es propenso a la diabetes.\n" +
"\n" +
"Controlar el peso: Mantenga a su perro en un peso saludable y evite el sobrepeso. La obesidad es un factor de riesgo importante \n"
        + "para la diabetes en los perros.\n" +
"\n" +
"Ejercicio regular: Asegúrese de que su perro haga suficiente ejercicio diario. El ejercicio ayuda a controlar el peso y a mejorar "
        + "la sensibilidad \na la insulina en su cuerpo.\n" +
"\n" +
"Revisiones regulares con el veterinario: Lleve a su perro al veterinario regularmente para realizar exámenes de salud y "
        + "controlar\n cualquier signo temprano de diabetes.\n" +
"\n" +
"Monitorear los niveles de azúcar en sangre: Si su perro es propenso a la diabetes, puede considerar monitorear regularmente "
        + "sus niveles de azúcar \nen sangre en casa para detectar cualquier problema temprano.\n";}


if(mayor==C9){Reco=Reco+"\n RECOMENDACION PARA EVITAR LA PERDIDA DE PELO \n"
        + "Cuida su alimentación: Una dieta equilibrada y nutritiva es fundamental para la salud del pelaje de tu perro. Asegúrate \n"
        + "de que su comida contenga una cantidad adecuada de proteínas, vitaminas y minerales esenciales para su pelaje.\n" +
"\n" +
"Mantén su piel y pelaje limpios: Baña a tu perro regularmente con un champú suave para mantener su piel y pelaje limpios y saludables.\n"
        + " También es importante cepillar a tu perro regularmente para remover el pelo muerto y estimular la circulación sanguínea.\n" +
"\n" +
"Controla las pulgas y garrapatas: Las infestaciones de pulgas y garrapatas pueden causar picazón y irritación en la piel, lo que "
        + "puede llevar a la pérdida de pelo.\n Usa productos antipulgas y garrapatas recomendados por tu veterinario.\n" +
"\n" +
"Asegúrate de que tu perro esté libre de parásitos internos: Las infestaciones de gusanos y otros parásitos internos pueden "
        + "afectar la salud del pelaje de tu perro.\n Habla con tu veterinario sobre los medicamentos antiparasitarios que pueden"
        + " ayudar a prevenir estas infestaciones.\n";}


if(mayor==C10){Reco=Reco+"\n RECOMENDACION PARA LA DESCAMACION \n"
        + "Bañe a su perro regularmente con un champú suave diseñado específicamente para perros. Evite usar productos para\n"
        + " humanos, ya que pueden ser demasiado fuertes para la piel de su perro.\n" +
"\n" +
"Asegúrese de enjuagar bien el champú y el acondicionador después del baño, ya que los residuos pueden irritar la piel y "
        + "\ncausar descamación.\n" +
"\n" +
"Use un acondicionador después del champú para hidratar la piel y el pelaje de su perro.\n" +
"\n" +
"Evite bañar a su perro con demasiada frecuencia, ya que esto puede eliminar los aceites naturales de la piel de su perro "
        + "y provocar descamación.\n" +
"\n" +
"Proporcione una dieta equilibrada y adecuada para su perro, rica en nutrientes y vitaminas esenciales para una piel sana.\n" +
"\n" +
"Use un cepillo suave para cepillar a su perro regularmente para estimular la producción de aceites naturales en la piel y "
        + "distribuirlos \nuniformemente por todo el pelaje.";}



if(mayor==C11){Reco=Reco+"\n RECOMENDACION PARA PROBLEMAS DE COMPORTAMIENTO \n"
        + "Establece una rutina diaria: Los perros necesitan una rutina diaria para sentirse seguros y estables. Establece "
        + "horarios fijos para \nalimentarlo, sacarlo a pasear y jugar con él.\n" +
"\n" +
"Proporciona suficiente ejercicio: Los perros necesitan suficiente ejercicio para mantenerse saludables física y mentalmente."
        + " Asegúrate de sacarlo a pasear \nregularmente y darle suficiente tiempo para correr y jugar.\n" +
"\n" +
"Dale una alimentación adecuada: Una dieta equilibrada y adecuada es importante para la salud de tu perro. Consulta con tu "
        + "veterinario para asegurarte \nde que estás proporcionando a tu perro una dieta adecuada para su raza y edad.\n" +
"\n" +
"Socializa a tu perro: Los perros necesitan socializar con otros perros y con personas para desarrollar habilidades sociales "
        + "saludables. \nAsegúrate de que tu perro tenga la oportunidad de interactuar con otros perros y personas en entornos seguros.\n" +
"\n" +
"Evita el castigo físico: El castigo físico puede generar más problemas de comportamiento en los perros y dañar la relación "
        + "entre tú y tu mascota.\n Utiliza técnicas de entrenamiento positivas y recompensas para fomentar un comportamiento saludable.\n";} }



public final void recomendacion(){
JOptionPane.showMessageDialog(null, "           RECOMENDACION PARA: "+Veterinaria_de_mascotas.P+
        "\n DUEÑO: "+Veterinaria_de_mascotas.Dueño+
        "\n NOMBRE DE MASCOTA: "+ Veterinaria_de_mascotas.Nombre+
        "\n RAZA: "+ Veterinaria_de_mascotas.Raza+
        "\n"+Reco);

}


@Override
   public void R(){JOptionPane.showMessageDialog(null, "Recuerde que no todos los datos mencionados son seguros y necesita ir a un especialista"
           + " para corroborar la informacion\n                                  GRACIAS POR USAR EL PROGRAMA");}

}



