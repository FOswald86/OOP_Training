package car;

public class Auto {

    // Welche Attribute hat ein Auto?
    String marke;
    int ps;
    double preis;
    static int haltbarkeit = 100;
    static int reparaturAnzahl = 0;
    int reifen = 4;

    // Konstruktoren - Fabrikmethoden
    public Auto( String marke, int ps, double preis ) {
        this.marke = marke;
        this.ps = ps;
        this.preis = preis;
    }

    public Auto() {

    }

    public Auto( String mercedes, int ps ) {
        this.marke = mercedes;
        this.ps = ps;
    }


    // Methoden
    // Was kann ein Auto machen?
    public static void fahren() {
        System.out.println("Das Auto faehrt");
        haltbarkeit--;
    }

    public void reparatur() {
        System.out.println("Das Auto wird repariert");
        haltbarkeit = 95 - reparaturAnzahl * 5;
        reparaturAnzahl++;
    }

    public void print() {
        System.out.printf( "System.out.printf(\"Marke: %s\nPS: %d\nPreis: %.2f", this.getMarke(), this.getPs(), this.getPreis() );
    }


    // Getter und Setter
    public int getReifen() {
        return reifen;
    }

    public void setReifen( int reifen ) {
        this.reifen = reifen;
    }

    public static int getReparaturAnzahl() {
        return reparaturAnzahl;
    }

    public static void setReparaturAnzahl( int reparaturAnzahl ) {
        Auto.reparaturAnzahl = reparaturAnzahl;
    }

    public static int getHaltbarkeit() {
        return haltbarkeit;
    }

    public static void setHaltbarkeit( int haltbarkeit ) {
        Auto.haltbarkeit = haltbarkeit;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke( String marke ) {
        this.marke = marke;
    }

    public int getPs() {
        return ps;
    }

    public void setPs( int ps ) {
        this.ps = ps;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis( double preis ) {
        this.preis = preis;
    }


}
