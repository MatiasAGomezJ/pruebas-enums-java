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

        System.out.println("--- valueOF() ---");
        // Da error
        // System.out.println(Severity.valueOf("ULTRAHIGH"));
        System.out.println(Severity.valueOf("HIGH"));


        System.out.println("--- equals() ---");
        System.out.println(Severity.LOW.equals(Severity.LOW));  // true
        System.out.println(Severity.LOW.equals("LOW"));         // false
        System.out.println(Severity.LOW.equals(0));             // false


        System.out.println("--- compareTo() ---");
        System.out.println(Severity.URGENT.compareTo(Severity.LOW));

        Severity s1 = Severity.LOW;
        Severity s2 = Severity.HIGH;
        // s1.compareTo(s2) returns s1.ordinal() - s2.ordinal()
        int diff = s1.compareTo(s2);
        if (diff > 0) {
            System.out.println(s1 + " occurs after " + s2);
        }
        else {
            System.out.println(s1 + " occurs before " + s2);
        }

        System.out.println("--- getDeclaringClass() ---");
        System.out.println(Severity.URGENT.getDeclaringClass());


        System.out.println("--- DefectUtil ---");
        int days = DefectUtil.getProjectedTurnaroundDays(Severity.URGENT);
        System.out.println( "Days to fix: " + days );

        System.out.println("--- Comparing two enum types ---");
        System.out.println(Severity.LOW.equals(Severity.LOW));
        System.out.println(Severity.LOW.equals(Severity.HIGH));
        System.out.println(Severity.LOW.equals(BasicColor.GREEN));
        System.out.println(Severity.LOW.equals(BasicColor.RED));
        System.out.println(Severity.LOW.equals(BasicColor.BLUE));

    }
}
