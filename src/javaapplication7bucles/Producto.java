/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Producto {
    
       private double cantidadProductos;
       private double precioProducto;
       private double ivaProducto;
       
       
       public Producto(){
       
        this.cantidadProductos = 0;
        this.precioProducto= 0;
        this.ivaProducto = 0;
        
        }
       
       public void solicitudCantProdu(){
           Scanner read = new Scanner(System.in);
           System.out.println("Ingrese la cantidad de articulos comprados: ");
           this.cantidadProductos = read.nextDouble();
       
       }
       
       public double sumaPrecioProductos(){
           
       Scanner read = new Scanner(System.in);
       double totalProducto =0;
            for (int i = 1; i<= this.cantidadProductos; i ++){
            
            System.out.println("ingrese el precio del producto numero "+i);
            this.precioProducto = read.nextDouble();
            totalProducto += this.precioProducto; 
            
            }
            this.precioProducto = totalProducto;
            return this.precioProducto;
       }
       public double calculoIva(){
       
        this.ivaProducto = this.precioProducto*0.19;
        return this.ivaProducto;   
       }
          public double valorTotalPagar()
       {
       double totalPagar =0;
       totalPagar = this.precioProducto + this.ivaProducto;
       return totalPagar;
       }
    
}
