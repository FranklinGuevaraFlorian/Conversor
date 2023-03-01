package OperacionesDelConversorDeMonedas; 
/**
 *
 * @author franklinadrianajguevaraflorian
 */
public class Operaciones extends Monedas{
    @Override 
    public double conversorDeDinero(double cantidadParaCambiar,int indice) {
      double cambioFinal = 0.0;
      switch(indice){
          case 0 -> cambioFinal = operacionDeSolesAMonedaExtranjera(getDolar(),cantidadParaCambiar);
          case 1 -> cambioFinal = operacionDeSolesAMonedaExtranjera(getEuro(), cantidadParaCambiar);
          case 2 -> cambioFinal = operacionDeSolesAMonedaExtranjera(getLibraEsterlina(), cantidadParaCambiar);
          case 3 -> cambioFinal = operacionDeSolesAMonedaExtranjera(getYenJapones(), cantidadParaCambiar);
          case 4 -> cambioFinal = operacionDeSolesAMonedaExtranjera(getWonSulCoreano(), cantidadParaCambiar);
          case 5 -> cambioFinal = operacionDeMonedaExtranjeraASoles(cantidadParaCambiar,getDolar());
          case 6 -> cambioFinal = operacionDeMonedaExtranjeraASoles(cantidadParaCambiar,getEuro());
          case 7 -> cambioFinal = operacionDeMonedaExtranjeraASoles(cantidadParaCambiar,getLibraEsterlina());
          case 8 -> cambioFinal = operacionDeMonedaExtranjeraASoles(cantidadParaCambiar,getYenJapones());
          case 9 -> cambioFinal = operacionDeMonedaExtranjeraASoles(cantidadParaCambiar,getWonSulCoreano());
      }
        return Math.round(cambioFinal * 100)/100d;
    };
    @Override
    public String nombreDeMoneda(int indice){
        String nombreDeLaMoneda = "";
        switch(indice){
            case 0 -> nombreDeLaMoneda  = "Dólares";
            case 1 -> nombreDeLaMoneda  = "Euros";
            case 2 -> nombreDeLaMoneda  = "Libras esterlinas";
            case 3 -> nombreDeLaMoneda  = "Yen Japonés";
            case 4 -> nombreDeLaMoneda  = "Won sul-coreano";
            default -> nombreDeLaMoneda = "Soles";
        }
        return " " + nombreDeLaMoneda;
    };
    @Override
    public double operacionDeSolesAMonedaExtranjera(double getMonedaExtranjera, double cantidadParaCambiar){
        return getMonedaExtranjera * cantidadParaCambiar;
    };
    @Override
    public double operacionDeMonedaExtranjeraASoles(double cantidadParaCambiar,double getMonedaExtranjera ){
        return cantidadParaCambiar/getMonedaExtranjera;
    };
    public boolean validarNumeros(String cadenaDeValor){
       return cadenaDeValor.matches("[0.0-9.9]*");
    };
};
