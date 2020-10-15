package org.alcampo;

import es.seresco.estandar.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "App Alcampo" );
        
        Nomina nomina = new Nomina();
        
        //Método de la clase Nomina de estandar.
        nomina.ImprimirNomina();
        
        //Método de la clase Nomina de estandar.
        nomina.LeerRecibos();        
    }
}
