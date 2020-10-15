package org.amazon;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "App Amazon" );
        
        Nomina nomina = new Nomina();
        
        // Método de la clase Nomina de amazon
        nomina.ImprimirNomina();
        
        //Método de la clase Nomina de estandar.
        nomina.LeerRecibos();
    }
}
