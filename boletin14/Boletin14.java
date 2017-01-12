
package boletin14;

import javax.swing.JOptionPane;


public class Boletin14 {

    
    public static void main(String[] args) {
        int eleccion;
        float temperatura;
        do{
            eleccion= Integer.parseInt(JOptionPane.showInputDialog("1) Celsius a Fharenheit.\n2) Celsius a Reamur.\n0) Salir."));
            temperatura = Float.parseFloat(JOptionPane.showInputDialog(args));
            switch(eleccion){
                case 1: 
                    break;
                case 2:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
            
        }while(eleccion!=0);
    }
    
}
