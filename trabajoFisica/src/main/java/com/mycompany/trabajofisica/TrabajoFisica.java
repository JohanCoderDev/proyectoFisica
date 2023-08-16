/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajofisica;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class TrabajoFisica {

    public static void main(String[] args) {
        
        String seleccion = JOptionPane.showInputDialog("Ingresa que deseas encontrar, " + "distancia , velocidad o tiempo");
        
        
        
        switch (seleccion.toLowerCase()) {
    case "distancia":
        String input = JOptionPane.showInputDialog("Ingrese la velocidad en m/seg a la que hizo el recorrido: "); 
        double velocidad;
        velocidad = Double.parseDouble(input);
        
        String otroValor = JOptionPane.showInputDialog("Ingrese el tiempo en segundos que tardo en hacer  el recorrido:"); 
        double tiempo;  
        tiempo = Double.parseDouble(otroValor);
        
        TrabajoFisica calculadora = new TrabajoFisica();
        double resultado = calculadora.distanciaRecorrida(velocidad, tiempo);
        JOptionPane.showMessageDialog(null, "La velocidad a la que hizo el recorrido es de: " + resultado + "  metros");
        break;
        
    case "velocidad":
        String input2 = JOptionPane.showInputDialog("Ingrese la distancia en metros que recorrio: "); 
        double distancia2;
        distancia2 = Double.parseDouble(input2);
        
        String otroValor2 = JOptionPane.showInputDialog("Ingrese el tiempo en segundos que tardo en hacer  el recorrido:"); 
        double tiempo2;  
        tiempo2 = Double.parseDouble(otroValor2);
        
        TrabajoFisica calculadora2 = new TrabajoFisica();
        double resultado2 = calculadora2.velocidadRecorrida(distancia2, tiempo2);
        JOptionPane.showMessageDialog(null, "La velocidad a la que hizo el recorrido es de: " + resultado2 + "  m/Seg");
        break;
        
        
    case "tiempo":
        String input3 = JOptionPane.showInputDialog("Ingrese la velocidad en m/seg a la que hizo el recorrido: "); 
        double distancia3;
        distancia3 = Double.parseDouble(input3);
        
        String otroValor3 = JOptionPane.showInputDialog("Ingrese la distancia en metros que recorrio: "); 
        double tiempo3;  
        tiempo3 = Double.parseDouble(otroValor3);
        
        TrabajoFisica calculadora3 = new TrabajoFisica();
        double resultado3 = calculadora3.tiempoCaminata(distancia3, tiempo3);
        JOptionPane.showMessageDialog(null, "El tiempo que tardo en hacer el recorrido fue de: " + resultado3 + "  segundos");
        
        break;
    
    default:
        JOptionPane.showMessageDialog(null, "Ups! no contamos con esa variable en nuestro algoritmo :( ");
        
}
       
      
        
       
        
        
       
    }
     public double tiempoCaminata(double velocidad, double distancia){
            double tiempo;
            tiempo = (distancia/velocidad);
            
            return tiempo;
         
        }
     
     public double distanciaRecorrida(double velocidad, double tiempo){
         double distancia;
         distancia = (velocidad * tiempo);
         
         return distancia;
     } 
     
     public double velocidadRecorrida(double distancia , double tiempo){
         double velocidad;
         velocidad = (distancia/tiempo);
         
         return velocidad;
     }
             
             
}
