package edu.poniperro.preubasenums.withsmartenum;

import edu.poniperro.preubasenums.withenum.Severity;

public class MainWithoutEnum
{
    public static void main( String[] args )
    {
        int days = 0;
        SmartSeverity.display();
        System.out.println( "Days to fix: " + days );

        int days2 = 0;
        days2 = SmartSeverity.checkDays("LOW");
        System.out.println(days2);

        SmartSeverity.LOW.prueba();
    }
}
