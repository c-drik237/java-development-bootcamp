package model;

public class Centrifuge extends LabEquipment {

    private int maxRPM;

    private static final int MINIMIN_RPM = 500;

    public Centrifuge(String manufacturer, String model, int year, int maxRPM){
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM < MINIMIN_RPM) throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM.");
        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    
    
}
