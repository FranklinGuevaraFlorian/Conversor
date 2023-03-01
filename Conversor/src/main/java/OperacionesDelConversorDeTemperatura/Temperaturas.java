package OperacionesDelConversorDeTemperatura;

/**
 *
 * @author franklin
 */
public abstract class Temperaturas implements Comportamientos {
    private double celsius;
    private double kelvin;
    private double fahrenheit;
    
    public Temperaturas(){
        this.celsius = 0.0;
        this.kelvin = 0.0;
        this.fahrenheit = 0.0;
    };

    public double getCelsius() {
        return celsius;
    };

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    };

    public double getKelvin() {
        return kelvin;
    };

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    };

    public double getFahrenheit() {
        return fahrenheit;
    };

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    };
    
}
