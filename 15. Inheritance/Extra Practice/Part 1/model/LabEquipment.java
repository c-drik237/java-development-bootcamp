package model;

public abstract class LabEquipment {
    private String manufacturer;
    private String model;
    private int year;

    private static final int MININUM_YEAR = 1950;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        if(manufacturer.isBlank() || manufacturer == null) throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if(model.isBlank() || model == null) throw new IllegalArgumentException("model cannot be null or blank.");

        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year < MININUM_YEAR) throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        this.year = year;
    }

    public abstract String performMaintenance();

    
}