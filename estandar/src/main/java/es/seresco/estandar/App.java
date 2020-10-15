package es.seresco.estandar;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "App Estandar" );
        
        Nomina nomina = new Nomina();
        
        nomina.ImprimirNomina();
       
        nomina.LeerRecibos();               
    }
}