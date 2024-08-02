/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        }


    

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */

    public static String Convertir_km_seg(float velocidad_km_seg) {
        try {
            // Declaración de constantes y variables
            float velocidad_metros_seg = 0;
            float velocidad_metros_hora = 0;
            final int kmxmetro = 1000;
            final int segxhora = 3600;
    
            // Procesos
            velocidad_metros_seg = velocidad_km_seg * kmxmetro; 
            velocidad_metros_hora = velocidad_km_seg *kmxmetro *segxhora;
    
            return velocidad_metros_seg + " m/s - " + velocidad_metros_hora + " m/h";
        } catch (Exception err) {
            return "Error en la conversión";
        }
    }
    
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */

   public static float Convertir_cm_lt (double cantidadCc){
    try {
        // Declarar variables y constante
        float cantidadLitros = 0;
        final int litrosCc = 1000; 

        // Proceso
        cantidadLitros = (float) (cantidadCc / litrosCc);

        return cantidadLitros; 
    } 
    
    catch (Exception e) {
        return 0; 
    }
}


   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   
   public static long Convertir_us_cops(int dolares){
    try {
        // Declarar variables y constantes
        long CantidadPesos = 0;
        final long TRM = 4170;

        // Procesos
        CantidadPesos = dolares * TRM;

        return CantidadPesos; 
    } 
    catch (Exception e) {
        return -1; 
    }
}


  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

   public static double Convertir_cent_far(double centigrados) {
    try {
        // Declarar variables y constantes
        double c = centigrados; 
        final double CONST_32 = 32; 
        final double CONST_9_DIV_5 = 9.0 / 5.0; 

        // procesos
        double fahrenheit = CONST_32 + (CONST_9_DIV_5 * c);

        return fahrenheit;
    } catch (Exception e) {

        return 0;
    }
}

          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {
    try {
        // Declarar variables y constantes
        int segundos_por_dia = 24 * 60 * 60;
        int segundos_por_hora = 60 * 60;
        int segundos_por_minuto = 60;

        // Procesos

        int total_segundos = dias * segundos_por_dia + horas * segundos_por_hora + minutos * segundos_por_minuto + segundos;

        return total_segundos;
    } catch (Exception e) {
    
        return -1;
    }
}
   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga(float peso_total, float peso_vacio) {
    try {
        // Declarar variables y constantes
        final int toneladas_kilos = 1000;
        float peso_neto = peso_total - peso_vacio;

        //procesos
        float peso_neto_kilos = peso_neto * toneladas_kilos;
        float peso_neto_toneladas = peso_neto;

        String resultado = (peso_neto_kilos + " kilos - " + peso_neto_toneladas + " toneladas");

        return resultado;
    } catch (Exception e) {
        return "Error en la función Calcular_peso_carga";
    }
}
   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

   public static float Calcular_horasxviaje(String destino, short distancia, short velocidad) {
    try {
        // Declarar variables y constantes
        float tiempo_viaje = 0;

        //procesos
        tiempo_viaje = (float) distancia / velocidad;


        return (float) (int) tiempo_viaje;

    } catch (Exception e) {
        
        return -1;
    }
}

  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
    try {
        //variables y constantes
        float despegue = (float) 1.2; 
        float aterrizaje = (float) 0.4;
        float consumo_km = (float) (0.2 / 60.8);
        final int rutas=4;

        // combustible por cada ruta
        float despegue_aterrizaje= (despegue + aterrizaje)*rutas;
        float consumo_ruta1 = (float) ruta1 * consumo_km;
        float consumo_ruta2 = (float) ruta2 * consumo_km;
        float consumo_ruta3 = (float) ruta3 * consumo_km;
        float consumo_ruta4 = (float) ruta4 * consumo_km;

        //combustible total
        float consumo_total = consumo_ruta1 + consumo_ruta2 + consumo_ruta3 + consumo_ruta4 + despegue_aterrizaje;

        return consumo_total;
    } catch (Exception e) {
        return -1;
    }
}

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */

   public static double  Calcular_peso_luna(byte peso_kilos) { 
    
    try {
        
        
        // Declarar variables y constantes 
        double peso_tierra_nuevo=0, peso_l_nuevo=0;
        final float gravedad= 9.81f, luna= 0.165f ;

    //procedimiento de peso en la Tierra
     peso_tierra_nuevo = peso_kilos * gravedad;

    // procedimiento para calcular el peso 
    peso_l_nuevo = peso_tierra_nuevo * luna;
    
    return peso_l_nuevo;

} 

catch (Exception e) {
    
    return 0;
}

}
   
   
}
