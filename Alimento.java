
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // instance variables - replace the example below with your own
    private String nombre;
    
    private int proteinas;
    
    private int grasas;
    
    private int carbohidratos;
    
    private int calorias;
    
    private String macronutriente;

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombre, int proteinas, int grasas,int carbohidratos, String macronutriente)
    {
        // initialise instance variables
       this.nombre=nombre;
       this.carbohidratos=carbohidratos;
       this.proteinas=proteinas;
       this.grasas=grasas;
       this.calorias=calorias;
       this.macronutriente=macronutriente;
    }

    /**
     *
     */
    public void muestraDatos()
    {
        // put your code here
       System.out.println ("Nombre: " + nombre);
      
        System.out.println ("Proteinas por cada 100 gramos: " + proteinas);
      
        System.out.println ("Carbohidratos por cada 100 gramos: " + carbohidratos);
      
        System.out.println ("Calorias: " + calorias);
      
        System.out.println ("Grasas por cada 100 gramos: " + grasas);
        
        System.out.println ("Componente/s mayoritario/s: " + macronutriente);
        
    }
    
    
}
