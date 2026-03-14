package model;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labEquipments;

    public Lab(){
        labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment (int index){
        return labEquipments.get(index).clone();
    }

    public void setLabEquipment (LabEquipment equipment, int index){
        labEquipments.set(index, equipment.clone());
    }

    public void addLabEquipment (LabEquipment equipment){
        labEquipments.add(equipment.clone());
    }
}
