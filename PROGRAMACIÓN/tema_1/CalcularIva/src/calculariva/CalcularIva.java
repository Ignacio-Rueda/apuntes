/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculariva;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class CalcularIva {

    public static void main(String[] args) {
          
        /*
         Mostrar el precio con IVA de la siguiente forma (Ten en cuenta que el IVA es del 21%)
        Introduce el precio del producto 8.4
        Importe del IVA: 1.764
        Precio con IVA: 10.164
        */
        double iva = 0.21;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        double ivaProducto = iva *precioProducto;
        double precioTotal = precioProducto + ivaProducto;
        System.out.println("Importe del Iva "+ivaProducto);
        System.out.println("Precio con IVA: "+precioTotal);
      
        
        
    }
    
}
