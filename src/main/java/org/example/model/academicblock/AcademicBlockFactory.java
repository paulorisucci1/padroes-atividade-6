package org.example.model.academicblock;

import org.example.model.equipments.ElectronicEquipment;
import org.example.model.equipments.ElectronicEquipmentFactory;

import java.util.ArrayList;
import java.util.List;

public class AcademicBlockFactory {

    public static AcademicBlock createAcademicBlock() {
        return new AcademicBlockProxy(getElectronicEquipmentsForBlock());
    }

    private static List<ElectronicEquipment> getElectronicEquipmentsForBlock() {
        List<ElectronicEquipment> electronicEquipmentList = new ArrayList<>();

        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("Lamp", 1));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("Lamp", 2));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("Lamp", 3));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("Lamp", 4));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("Lamp", 5));

        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("AirConditioner", 1));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("AirConditioner", 2));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createElectronicEquipment("AirConditioner", 3));

        return electronicEquipmentList;
    }
}
