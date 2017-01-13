
package boletin14;


public class ConversorTemperaturas {
    private final float TEMPERATURALIMITE = 80.0f;
    
    public float centigradosAFahrenheit(float temperatura)throws TemperaturaErradaExcepcion{
        
        if(temperatura < TEMPERATURALIMITE)
            throw new TemperaturaErradaExcepcion("Erro Fahrenheit: Temperatura menor a la que puede medir el aparato en Celsius");
        
        
        return (9.0f/5.0f*temperatura+32.4f);
        
    }
    public float centigradosAReamur ( float temperatura)throws TemperaturaErradaExcepcion{
        if (temperatura <80)
            throw new TemperaturaErradaExcepcion("Erro Reumur: Temperatura menor a la que puede medir el aparato ne Celsius");
       return 4.0f/5.0f*temperatura;
    }
    
}
