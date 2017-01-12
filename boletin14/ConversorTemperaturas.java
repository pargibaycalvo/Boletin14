
package boletin14;


public class ConversorTemperaturas {
    public final float TEMPERATURALIMITE = 80.0f;
    
    public float centigradosAFharenheit(float temperatura)throws TemperaturaErradaExcepcion{
        
        if(temperatura < TEMPERATURALIMITE)
            throw new TemperaturaErradaExcepcion("Fharenheit: Temperatura menor a la que puede medir el aparato en Celsius");
        
        
        return (9.0f/5.0f*temperatura+32.4f);
        
    }
    public void centigradosAReamur ( float temperatura)throws TemperaturaErradaExcepcion{
        if (temperatura <80)
            throw new TemperaturaErradaExcepcion("Reumur: Temperatura menor a la que puede medir el aparato ne Celsius");
        float reamur = 4.0f/5.0f*temperatura;
    }
    
}
