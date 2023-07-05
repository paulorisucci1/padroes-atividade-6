package org.example;

import org.example.model.Professor;
import org.example.model.academicblock.AcademicBlock;
import org.example.model.academicblock.AcademicBlockFactory;

public class Main {
    public static void main(String[] args) {

        Professor alex = new Professor("Alex", "123");
        Professor fred = new Professor("Fred", "234");
        Professor valeria = new Professor("Valéria", "345");
        Professor heremita = new Professor("Heremita", "456");
        Professor jaildo = new Professor("Jaildo", "567");

        AcademicBlock computingBlock = AcademicBlockFactory.createAcademicBlock();

        computingBlock.enter(alex);
        computingBlock.enter(fred);
        computingBlock.enter(valeria);
        computingBlock.enter(heremita);
        computingBlock.enter(jaildo);

        computingBlock.leave(alex);
        computingBlock.leave(fred);
        computingBlock.leave(valeria);
        computingBlock.leave(heremita);
        computingBlock.leave(jaildo);
    }
}