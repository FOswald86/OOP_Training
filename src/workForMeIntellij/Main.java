package workForMeIntellij;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {

        // var
        var number = "Hallo";
        System.out.println( number );

        LocalDate jetzt = LocalDate.now();
        System.out.println( jetzt );

        String s;

        Scanner scanner = new Scanner( System.in );

        // 1 == 1.if
        // 1 == 1.while & replace while - dowhile
        int counter = 0;
        while ( counter < 2 ) {
            counter++;
        }

        do {
            System.out.print( "Eingabe: " );
            s = scanner.nextLine();
        } while ( !s.equals( "exit" ) );


        // array.for & replace foreach - for
        int[] ints = new int[10];
        for ( int i = 0; i < ints.length; i++ ) {
            System.out.println("Test");
        }


    }


}
