package org.example.model.academicblock;

import org.example.model.Professor;
import org.example.model.equipamentos.ElectronicEquipment;

import java.util.List;

public class AcademicBlockProxy implements AcademicBlock {

    private final AcademicBlockReal academicBlock;

    AcademicBlockProxy(List<ElectronicEquipment> electronicEquipmentList) {
        this.academicBlock = new AcademicBlockReal(electronicEquipmentList);
    }

    @Override
    public void enter(Professor professor) {
        if(this.academicBlock.isEmpty()) {
            this.academicBlock.turnOnEquipments();
        }
        this.academicBlock.enter(professor);
    }

    @Override
    public void leave(Professor professor) {
        this.academicBlock.leave(professor);

        if(this.academicBlock.isEmpty()) {
            this.academicBlock.turnOffEquipments();
        }
    }
}
