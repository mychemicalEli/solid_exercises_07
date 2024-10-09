package taller.mecanico;

import taller.mecanico.interfaces.CambioAceite;
import taller.mecanico.interfaces.ReparacionMotor;
import taller.mecanico.taller.TallerMecanico;
import taller.mecanico.utils.CambioAceiteImpl;
import taller.mecanico.utils.ReparacionMotorImpl;

public class Main {
    public static void main(String[] args) {
        ReparacionMotor reparacionMotor = new ReparacionMotorImpl();
        CambioAceite cambioAceite = new CambioAceiteImpl();
        TallerMecanico tallerMecanico = new TallerMecanico(reparacionMotor, cambioAceite);
        tallerMecanico.realizarServicio();
    }
}