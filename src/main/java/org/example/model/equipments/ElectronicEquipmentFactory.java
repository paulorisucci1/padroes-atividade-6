package org.example.model.equipments;

public class ElectronicEquipmentFactory {

    public static ElectronicEquipment createLamp(int id) {
        return new Lamp(id);
    }

    public static ElectronicEquipment createAirConditioner(int id) {
        return new AirConditioner(id);
    }
}
