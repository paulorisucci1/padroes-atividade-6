package org.example.model.equipamentos;

public class Lamp implements ElectronicEquipment {

    private final int id;

    private boolean isOn;

    Lamp(int id) {
        this.id = id;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the lamp "+id);
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the lamp "+id);
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
