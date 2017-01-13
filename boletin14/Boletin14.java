
package boletin14;

import javax.swing.JOptionPane;


public class Boletin14 {

    
    public static void main(String[] args) {
        int eleccion;
        float temperatura;
        ConversorTemperaturas obx = new ConversorTemperaturas();
        do{
            eleccion= Integer.parseInt(JOptionPane.showInputDialog("1) Celsius a Fharenheit.\n2) Celsius a Reamur.\n0) Salir."));
            switch(eleccion){
                case 1: 
                    try{
                        JOptionPane.showMessageDialog(null, "Fharenheit = "+obx.centigradosAFahrenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura en ºC a convertir a Fharenheit:"))));
                    
                    }catch(TemperaturaErradaExcepcion e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    break;
                case 2:
                    try{
                    
                        JOptionPane.showMessageDialog(null, "Reamur = "+obx.centigradosAFahrenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura en ºC a convertir a Reamur:"))));
                    
                    }catch(TemperaturaErradaExcepcion e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Esa Opción no se contempla.");
                    break;
            }
        }while(eleccion!=0);
    }
    
}
