/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package OperacionesDelConversorDeTemperatura;

/**
 *
 * @author franklin
 */
public interface Comportamientos {
    
    public abstract double DeFahrenheit(double cantidadAConvertir, int index);
    public abstract double DeCelsius(double cantidadAConvertir, int index);
    public abstract double DeKelvein(double cantidadAConvertir, int index);
    public abstract String nombreDeTemperatura(int index);

};
