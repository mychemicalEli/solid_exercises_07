package taller.mecanico.utils;

import taller.mecanico.interfaces.ReparacionMotor;

public class ReparacionMotorImpl implements ReparacionMotor {
    @Override
    public void repararMotor() {
        System.out.println("Reparando motor...");
    }
}
