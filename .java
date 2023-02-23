public  class  temaCuatro {
    public  static  void  main ( String [] args ) {
        int  numeroSi = 3 ;

        if ( numeroSi >= 0 ){
            sistema _ fuera _ println ( "el numero es positivo" );
        } más {
            sistema _ fuera _ println ( "el numero es negativo" );
        }
        sistema _ fuera _ println ( "-----------------------" );

        int  numeroMientras = 0 ;
        while ( numeroMientras < 3 ) {
            sistema _ fuera _ println ( numeroMientras );
            numeroMientras ++;
        }
        sistema _ fuera _ println ( "-----------------------" );

        int  numeroDoMientras = 3 ;
        hacer {
            sistema _ fuera _ println ( numeroDoMientras );
            numeroDoMientras ++;
        } mientras ( numeroDoMientras < 3 );

        sistema _ fuera _ println ( "-----------------------" );

        for ( int  numeroPara = 0 ; numeroPara <= 3 ; numeroPara ++){
            sistema _ fuera _ println ( numeroPara );
        }

        sistema _ fuera _ println ( "-----------------------" );

        var  estacion = "otono" ;

        cambiar ( estacionar ){
            caso  "primavera" :
                sistema _ fuera _ println ( "Es primavera" );
                romper ;
            caso  "verano" :
                sistema _ fuera _ println ( "Es verano" );
                romper ;
            caso  "otono" :
                sistema _ fuera _ println ( "Es otoño" );
                romper ;
            caso  "invierno" :
                sistema _ fuera _ println ( "Es invierno" );
                romper ;
            predeterminado :
                sistema _ fuera _ println ( "No es una estacion" );
        }
    }
}
