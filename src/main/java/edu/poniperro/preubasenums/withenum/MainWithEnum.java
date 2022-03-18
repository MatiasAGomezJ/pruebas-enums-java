package edu.poniperro.preubasenums.withenum;

public class MainWithEnum
{
    public static void main( String[] args )
    {
        System.out.println("--- name(), ordinal(), values() ---");
        for (Severity severity:
             Severity.values()) {
            System.out.println(severity.name() + ": " + severity.ordinal());
        }

        System.out.println("--- valueOFº ---");
        // Da error
        // System.out.println(Severity.valueOf("ULTRAHIGH"));
        System.out.println(Severity.valueOf("HIGH"));


        System.out.println("--- EQUALS ---");
        System.out.println(Severity.LOW.equals(Severity.LOW));  // true
        System.out.println(Severity.LOW.equals("LOW"));         // false
        System.out.println(Severity.LOW.equals(0));             // false


        System.out.println("--- COMPARETO ---");
        System.out.println(Severity.URGENT.compareTo(Severity.LOW));

        System.out.println("--- getDeclaringClass ---");
        System.out.println(Severity.URGENT.getDeclaringClass());


        System.out.println("--- SWITCH ---");
        int days = 0;
        System.out.println( "Days to fix: " + days );
    }
}
