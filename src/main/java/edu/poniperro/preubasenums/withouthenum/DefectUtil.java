package edu.poniperro.preubasenums.withouthenum;

public class DefectUtil {
    public static int getProjectedTurnaroundDays(int severity) {
        int days = 0;

        switch (severity) {
            case Severity.LOW:
                days = 30;
                break;
            case Severity.MEDIUM:
                days = 15;
                break;
            case Severity.HIGH:
                days = 7;
                break;
            case Severity.URGENT:
                days = 1;
                break;
            default:
                days = 0;
                break;
        }

        return days;
    }
}
