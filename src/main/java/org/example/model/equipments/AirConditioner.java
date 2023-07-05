package org.example.model.equipments;

public class AirConditioner implements ElectronicEquipment {

    private final int id;

    private boolean isOn;

    AirConditioner(int id) {
        this.id = id;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the air conditioner "+id);
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the air conditioner "+id);
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
