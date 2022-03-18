package edu.poniperro.preubasenums;
import edu.poniperro.preubasenums.withouthenum.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int days = DefectUtil.getProjectedTurnaroundDays(2);
        System.out.println( "Days to fix: " + days );
    }
}
