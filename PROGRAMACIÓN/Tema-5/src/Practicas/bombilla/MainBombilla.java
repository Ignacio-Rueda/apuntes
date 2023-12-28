/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practicas.bombilla;

/**
 *
 * @author Ignacio Rueda
 */
public class MainBombilla {

    public static void main(String[] args) {
        //1- Mostrar el número de bombillas creadas hasta el momento.
        System.out.printf("Número de bombillas creadas hasta el momento: %d%n",Bombilla.getBombillasCreadas());
        //2- Mostrar el número de bombillas encendidas hasta el momento.
        System.out.printf("Número de bombillas encendidas hasta el momento: %d%n%n",Bombilla.getBombillasEncendidas());
        
        
        //3- Declaración de variables de tipo referencia a la clase Bombilla.
        Bombilla b1, b2, b3;
        System.out.printf("Declarando variables b1,b2,b3 de tipo referencia a objetos Bombilla%n%n");
        
        //4- Instanciar una primera bombilla, asignar su referencia a la variable b1, usando el constructor si parámetros y se muestre su estado usando el método getEstado.
        b1 = new Bombilla();
        System.out.printf("Creación de b1%n");
        System.out.printf("Estado de b1: %b%n%n",b1.getEstado());
        
        //5-Instanciar una segunda bombilla encendida, se asigne su referencia a la variable b2 usando el constructor con parámetros y se muestre su estado usando el método toString.
        b2 = new Bombilla(true);
        System.out.printf("Creación de b2%nEstado de b2: ");
        System.out.println(b2.toString());
        
        //6- Para esta segunda bombilla, se realizan las siguientes acciones(tras cada acción se mostrará su estado mediante el método toString)
        //6.1 Se conmuta su estado tres veces seguidas mediante un bucle for
        
        for (int n = 0; n < 3; n++) {
            System.out.printf("%nConmutando estado de b2.%nEstado de b2: ");
            b2.conmutar();
            System.out.println(b2.toString());
        }
        //6.2 Se enciende dos veces seguidas
        System.out.printf("Encendiendo b2%n");
        try {
            b2.encender();
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        System.out.printf("Estado de b2:%s%n",b2.toString());
        
        System.out.printf("Encendiendo b2%n");
        try {
            b2.encender();
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        System.out.printf("Estado de b2:%s%n",b2.toString());
        //6.3 Se apaga una vez
        System.out.printf("Apgando b2%n");
        try {
            b2.apagar();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.printf("Estado de b2:%s%n",b2.toString());
        //6.4 Se vuelve a encender
        System.out.printf("Encendiendo b2%n");
        try {
            b2.encender();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.printf("Estado de b2:%s%n",b2.toString());
        //7- Instanciar una tercera bombilla encendida, se asigna su referencia a la variable b3 usando el constructor con parámetros y mostar su estado usando el método toString.
        System.out.printf("Creación de b3%n");
        b3 = new Bombilla(true);
        System.out.printf("Estado de b3: %s",b3.toString());
        //8- Se muestre la cantidad de bombillas creadas hasta el momento mediante el uso del método getBombillasCreadas
        System.out.printf("Número de bombillas creadas hasta el momento %s%n",Bombilla.getBombillasCreadas());
        //9- Se muestre la cantidad de bombillas encendidas en este momento mediante el uso del método getBombillasEncendidas.
        System.out.printf("Número de bombillas encendidas hasta el momento %s%n",Bombilla.getBombillasEncendidas());
        
    
       
       
        
    }

}
