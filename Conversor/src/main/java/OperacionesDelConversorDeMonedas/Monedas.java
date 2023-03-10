package OperacionesDelConversorDeMonedas;
/**
 *
 * @author franklinadrianajguevaraflorian
 */
public abstract class Monedas implements Comportamientos {
    
    private final double dolar;
    private final double euro;
    private final double libraEsterlina;
    private final double yenJapones;
    private final double wonSulCoreano;

    public Monedas(){
       this.dolar = 0.26;
       this.euro = 0.25;
       this.libraEsterlina = 0.22;
       this.yenJapones = 35.27;
       this.wonSulCoreano = 341.52;
    };

    public double getDolar() {
        return dolar;
    };

    public double getEuro() {
        return euro;
    };

    public double getLibraEsterlina() {
        return libraEsterlina;
    };

    public double getYenJapones() {
        return yenJapones;
    };

    public double getWonSulCoreano() {
        return wonSulCoreano;
    };
   
};
