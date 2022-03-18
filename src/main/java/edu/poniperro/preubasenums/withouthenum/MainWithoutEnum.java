package edu.poniperro.preubasenums.withouthenum;

public class MainWithoutEnum
{
    public static void main( String[] args )
    {
        int days = DefectUtil.getProjectedTurnaroundDays(2);
        System.out.println( "Days to fix: " + days );
    }
}
