package dataTypes;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public staticMethoden void main( String[] args ) {

        // primitive Datentypen
        // int, double, boolean usw.

        // Objekte bzw. Klassen Datentypen
        String name = "Frank";
        LocalDate now = LocalDate.now();
        Random random = new Random();
        Scanner scanner = new Scanner( System.in );
        int[] ints = new int[10];

        // Mit dem Punkt hinter dem Variablen-Namen kann man sich Möglichkeiten anzeigen lassen,
        // was man mit dem Objekt machen kann
        char[] chars = name.toCharArray();
        boolean b = random.nextBoolean();
        int monthValue = now.getMonthValue();
        String s = scanner.nextLine();

    }

}
