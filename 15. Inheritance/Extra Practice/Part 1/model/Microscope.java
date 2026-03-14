package model;

public class Microscope extends  LabEquipment {
    
    private int magnification;

    private static final int MININUM_MAGNIFICATION = 0;


    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        if(magnification < MININUM_MAGNIFICATION) throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }


    
}
