package edu.poniperro.preubasenums.withsmartenum;

public enum SmartSeverity {
    LOW(30), MEDIUM(15), HIGH(7), URGENT(1);

    // Declare an instance variable
    private int projectedTurnaroundDays;

    // Declare a private constructor
    private SmartSeverity(int projectedTurnaroundDays) {
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }

    // Declare a public method to get the turnaround days
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }

    public static void display() {
        String output = "";
        for (SmartSeverity s: SmartSeverity.values()) {
            output += "\t" + s.name() + "...." + s.projectedTurnaroundDays + "$\n";
        }
        System.out.println(output);
    }
    public static int checkDays(String sName) {
        return SmartSeverity.valueOf(sName).getProjectedTurnaroundDays();
    }

    public void prueba() {
        System.out.println(SmartSeverity.values() instanceof int);
        System.out.println(SmartSeverity.values());
    }
}