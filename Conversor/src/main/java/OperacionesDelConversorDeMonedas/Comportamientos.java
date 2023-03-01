/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package OperacionesDelConversorDeMonedas;

/**
 *
 * @author franklin
 */
public interface Comportamientos {
    
   public abstract double conversorDeDinero(double cantidadParaCambiar, int indice);
   public abstract String nombreDeMoneda(int indice);
   public abstract double operacionDeSolesAMonedaExtranjera(double getMonedaExtranjera, double cantidadParaCambiar);
   public abstract double operacionDeMonedaExtranjeraASoles(double cantidadParaCambiar,double getMonedaExtranjera );

};
