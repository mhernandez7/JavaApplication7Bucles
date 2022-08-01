
package javaapplication7bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication7Bucles {

    public static void main(String[] args) {
      
       Producto producto = new Producto();
       producto.solicitudCantProdu();
       
       System.out.println("Valor total sin IVA de los productos ingresados: "+producto.sumaPrecioProductos());
       System.out.println("Impuesto del iva: "+producto.calculoIva());
       System.out.println("Impuesto del iva: "+producto.valorTotalPagar());     
        
       
    } 
    
}
