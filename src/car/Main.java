package car;

public class Main {

    void main( String[] args ) {

        Auto auto = new Auto();

        auto.print();

        auto.setMarke( "BMW" );
        auto.setPs( 120 );
        auto.setPreis( 7999.99 );

        auto.print();

        AutoAbnuetzungUndReperaturSchulweg( 11, auto );

        Auto auto1 = new Auto();
        auto1.setMarke( "VW" );
        auto1.setPs( 55 );
        Auto auto2 = new Auto();
        auto2.setMarke( "Seat" );
        Auto auto3 = new Auto();
        auto3.setMarke( "Popel" );

        // Konstruktor
        Auto audi = new Auto( "Audi", 150, 13999.99 );
        audi.print();
        AutoAbnuetzungUndReperaturSchulweg( 25, audi );

        // Überladener Konstruktor
        Auto mercedes = new Auto( "Mercedes", 220 );
        mercedes.print();

        // Fabrikmethode
        Auto suzuki = Auto.getInstance( "Suzuki", 45, 7999.99 );
        suzuki.print();

    }

    void AutoAbnuetzungUndReperaturSchulweg( int km, Auto auto ) {
        // Abendschulweg Hin und Retour - 16x pro Monat - 5 Monate lang
        int kmAbendschulWegSemester = km * 2 * 16 * 5;

        for ( int i = 0; i < kmAbendschulWegSemester; i++ ) {
            auto.fahren();
            if ( auto.getHaltbarkeit() <= 20 ) {
                auto.reparatur();
            }
            if ( auto.getHaltbarkeit() <= 10 ) {
                System.out.println( "Du brauchst ein neues Auto" );
                break;
            }
        }
        System.out.println( "Reperaturanzahl: " + auto.getReparaturAnzahl() );
    }

}
