package car;

public class Main {

    public static void main( String[] args ) {

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
        auto3.setMarke( "Popel");

        Auto audi = new Auto( "Audi", 150, 13999.99 );
        audi.print();
        AutoAbnuetzungUndReperaturSchulweg( 25, audi );

        Auto mercedes = new Auto( "Mercedes", 220 );
        mercedes.print();

    }

    private static void AutoAbnuetzungUndReperaturSchulweg( int km, Auto auto ) {
        int kmAbendschulWeg = km;
        // Abendschulweg Hin und Retour
        int kmAbendschulWegSemester = kmAbendschulWeg * 2 * 16 * 5;

        for ( int i = 0; i < kmAbendschulWegSemester; i++ ) {
            auto.fahren();
            if ( auto.getHaltbarkeit() <= 20 ) {
                auto.reparatur();
            }
            if ( auto.getHaltbarkeit() <= 10 ) {
                System.out.println("Du brauchst ein neues Auto");
                break;
            }
        }
        System.out.println("Reperaturanzahl: " + auto.getReparaturAnzahl());
    }

}
