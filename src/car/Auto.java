package car;

public class Auto {

    // Welche Attribute hat ein Auto?
    String marke;
    int ps;
    double preis;
    int haltbarkeit = 100;
    int reparaturAnzahl = 0;
    int reifen = 4;

    // Konstruktoren
    public Auto( String marke, int ps, double preis ) {
        this.marke = marke;
        this.ps = ps;
        this.preis = preis;
    }

    public Auto() {
        // So sieht der Standard-Konstruktor aus.
        // Legt man eigene individuelle Konstruktoren an muss dieser leere Konstruktor mit angelegt werden,
        // damit der Compiler unterscheiden kann, ob man den Standard- oder den Überladenen-Konstruktor oder haben will
    }

    public Auto( String mercedes, int ps ) {
        this.marke = mercedes;
        this.ps = ps;
    }


    // Methoden
    // Fabrikmethode
    public static Auto getInstance(String marke, int ps, double preis){
        Auto auto = new Auto();
        auto.setMarke( marke );
        auto.setPs( ps );
        auto.setPreis( preis );
        return auto;
    }

    // Was kann ein Auto machen?
    public void fahren() {
        System.out.println( "Das Auto faehrt" );
        this.haltbarkeit--;
    }

    public void reparatur() {
        System.out.println( "Das Auto wird repariert" );
        this.haltbarkeit = 95 - this.reparaturAnzahl * 5;
        this.reparaturAnzahl++;
    }

    public void print() {
        System.out.printf( "System.out.printf(\"Marke: %s\nPS: %d\nPreis: %.2f", this.getMarke(), this.getPs(), this.getPreis() );
    }


    // Getter und Setter automatisch generieren mit ALT+EINF
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

    public int getHaltbarkeit() {
        return haltbarkeit;
    }

    public void setHaltbarkeit( int haltbarkeit ) {
        this.haltbarkeit = haltbarkeit;
    }

    public int getReparaturAnzahl() {
        return reparaturAnzahl;
    }

    public void setReparaturAnzahl( int reparaturAnzahl ) {
        this.reparaturAnzahl = reparaturAnzahl;
    }

    public int getReifen() {
        return reifen;
    }

    public void setReifen( int reifen ) {
        this.reifen = reifen;
    }
}
