package taller.mecanico.taller;

import taller.mecanico.interfaces.CambioAceite;
import taller.mecanico.interfaces.ReparacionMotor;

public class TallerMecanico {
    private ReparacionMotor reparacionMotor;
    private CambioAceite cambioAceite;

    public TallerMecanico(ReparacionMotor reparacionMotor, CambioAceite cambioAceite) {
        this.reparacionMotor = reparacionMotor;
        this.cambioAceite = cambioAceite;
    }

    public void realizarServicio() {
        reparacionMotor.repararMotor();
        cambioAceite.cambiarAceite();
    }
}

