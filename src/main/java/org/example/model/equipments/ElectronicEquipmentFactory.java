package org.example.model.equipments;

public class ElectronicEquipmentFactory {


    public static ElectronicEquipment createElectronicEquipment(String type, int id) {
        if(type.equalsIgnoreCase("Lamp")) {
            return new Lamp(id);
        }
        return new AirConditioner(id);
    }
}
