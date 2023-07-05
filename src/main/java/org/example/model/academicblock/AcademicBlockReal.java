package org.example.model.academicblock;

import org.example.model.Professor;
import org.example.model.equipamentos.ElectronicEquipment;

import java.util.ArrayList;
import java.util.List;

public class AcademicBlockReal implements AcademicBlock {

    private final List<ElectronicEquipment> electronicEquipments;

    private final List<Professor> professors;

    AcademicBlockReal(List<ElectronicEquipment> electronicEquipments) {
        this.electronicEquipments = electronicEquipments;
        this.professors = new ArrayList<>();
    }

    boolean isEmpty() {
        return this.professors.isEmpty();
    }

    public void turnOnEquipments() {
        this.electronicEquipments.forEach(ElectronicEquipment::turnOn);
    }

    public void turnOffEquipments() {
        this.electronicEquipments.forEach(ElectronicEquipment::turnOff);
    }

    @Override
    public void enter(Professor professor) {
        this.professors.add(professor);
        System.out.println("Professor "+professor.getName()+" is entering the block");
    }

    @Override
    public void leave(Professor professor) {
        this.professors.remove(professor);
        System.out.println("Professor "+professor.getName()+" is leaving the block");
    }
}
