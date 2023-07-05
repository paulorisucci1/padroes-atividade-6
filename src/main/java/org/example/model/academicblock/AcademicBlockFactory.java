package org.example.model.academicblock;

import org.example.model.equipamentos.ElectronicEquipment;
import org.example.model.equipamentos.ElectronicEquipmentFactory;

import java.util.ArrayList;
import java.util.List;

public class AcademicBlockFactory {

    public static AcademicBlock createAcademicBlock() {
        return new AcademicBlockProxy(getElectronicEquipmentsForBlock());
    }

    private static List<ElectronicEquipment> getElectronicEquipmentsForBlock() {
        List<ElectronicEquipment> electronicEquipmentList = new ArrayList<>();

        electronicEquipmentList.add(ElectronicEquipmentFactory.createLamp(1));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createLamp(2));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createLamp(3));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createLamp(4));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createLamp(5));

        electronicEquipmentList.add(ElectronicEquipmentFactory.createAirConditioner(1));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createAirConditioner(2));
        electronicEquipmentList.add(ElectronicEquipmentFactory.createAirConditioner(3));

        return electronicEquipmentList;
    }
}
