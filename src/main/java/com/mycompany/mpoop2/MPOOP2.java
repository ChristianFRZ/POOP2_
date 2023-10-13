/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mpoop2;

/**
 *
 * @author sonic
 */
public class MPOOP2 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.err.println("Hola mundo");
        
        System.out.println("############## if ##############");
        /**
         * Compara el valor de 'a' y 'b' para imprimir un mensaje
         * en función de la relación de estos valores
         */
        int a;
        a = 15;
        int b = 10;
        if (a<b){
            System.out.println("a es menor que b");
      
        } else if (a==b){
            System.out.println("a es igual a b");
        }else{
            
            System.out.println("a es mayor que b");
        }
        System.out.println("############## if ##############");
        /**
         * Usa un método llamado 'menor' para realizar comparaciones
         * y utlizar el resultado para determinar qué mensaje se imprime
         * en consola
         */
        if (menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }
        
        System.out.println("############## Switch ##############\"");
        /**
         * Realiza una selección múltiple basada en el valor de la variable
         *'dia' para imprimir el nombre del día de la semana
         */
        int dia = 1;
        switch(dia){
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Lunes");break;
            case 3: System.out.println("Martes");break;
            case 4: System.out.println("Miercoles");break;
            case 5: System.out.println("Jueves");break;
            case 6: System.out.println("Viernes");break;
            case 7: System.out.println("Sabado");break;
            default:
                System.out.println("Día incorrecto");
        }
        System.out.println("############## Switch ##############");
        /**
         * Se basa en el valor de la vocal para imprimir el mensaje correspondiente
         * En este caso manda al bloque default
         */
        char vocal = '9';
        switch (vocal){
            case 'a': System.out.println("Seleccionó vocal a");break;
            case 'e': System.out.println("Seleccionó vocal e");break;
            case 'i': System.out.println("Seleccionó vocal i");break;
            case 'o': System.out.println("Seleccionó vocal o");break;
            case 'u': System.out.println("Seleccionó vocal u");break;
            default:
                System.out.println("No se seleccionó una vocal");
        
        System.out.println("############## While ##############");
        /**
         * Utilización de dos ciclos para contar hacia arriba y hacia abajo
         * utilizando la variable 'n'. El valor final se muestra 
         * después de salir de los bucles. 
         */
        int n = 0;
        while (n < 10){
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0){
            System.out.println("Contando hacia abajo"+n);
            n--;
        }
        System.out.println("n="+n);
        
        
        System.out.println("############## Do-While ##############");
        /**
         * Utiliza buble Do-while para contar hacia abajo desde el valor de 
         * 'n' hasta 1, ejecutandose al menos una vez
         */
        do {
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        System.out.println("############## For ##############");
        /**
         * Utiliza el bucle para contar hacia arriba y hacia abajo utilizando
         * la variable 'i'  para controlarlo gracias a su incremento o decremento
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
         System.out.println("############## For ##############");
        /**
         * Inicialización del arreglo
         */
        int[] miArreglo = {1,2,3,4,5};
        /**
         * Calcular la longitud del arreglo
         */
        }
        int[] miArreglo = new int[10];
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        /**
         * Declaración de un segundo arreglo con 10 elementos
         */
        int[] miArreglo2 = new int[10];
        /**
         * Calcular la longitud del arreglo 2
         */
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        /**
         * inicializar x10 los elementos de 'miarreglo2' 
         */
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        /**
         * Mostrar los valores
         */
        for (int i = 0; i < miArreglo2.length; i++) {
             System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        /**
         * Recorre 'mmiArreglo2' y asigna elemento a variable 'j'
         */
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        System.out.println("############## For-each ##############");
        /**
         * Recorre cada elemento y almacena el valor del elemento en 'i'
         * Se imprime 'i' junto con "Hackeando la nasa"
         */
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
           
        }
    private static boolean menor(int x, int y){ 
        
    return x < y;
    }
}
