package OperacionesDelConversorDeTemperatura;
/**
 *
 * @author franklin
 */
public class Operaciones extends Temperaturas{

    @Override
    public double DeFahrenheit(double cantidadAConvertir, int index) {
        double resultado = 0.0;
        switch(index){
            case 0 -> resultado =  (cantidadAConvertir - 32) * 5/9;
            case 1 -> resultado =  (cantidadAConvertir - 32) + 273.15;
        }
        
        return  Math.round(resultado * 100)/100d;
    };
    @Override
    public double DeCelsius(double cantidadAConvertir, int index) {
        double resultado = 0.0;
        switch(index){
            case 2 -> resultado =  (cantidadAConvertir * 9/5) + 32;
            case 3 -> resultado =   cantidadAConvertir + 273.15;
        }
        return  Math.round(resultado * 100)/100d;
    };
    @Override
    public double DeKelvein(double cantidadAConvertir, int index) {
        double resultado = 0.0;
        switch(index){
            case 4 -> resultado = (cantidadAConvertir - 273.15) * 9/5 + 32; 
            case 5 -> resultado =  cantidadAConvertir - 273.15;
        }
        return  Math.round(resultado * 100)/100d;
    };
    @Override
    public String nombreDeTemperatura(int index) {
    
        String nombre = "";
        switch(index){
            case 0 , 5 -> nombre = "Celsius";
            case 1 , 3 -> nombre = "Kelvin";
            case 2 , 4 -> nombre = "Fahrenheit";         
        }
        return nombre;
    };
    public boolean validarNumeros(String cadenaDeValor){
       return cadenaDeValor.matches("[0.0-9.9]*");
    };
};
