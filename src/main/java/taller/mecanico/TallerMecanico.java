package taller.mecanico;

class TallerMecanico {
    private ReparacionMotor reparacionMotor;
    private CambioAceite cambioAceite;

    public TallerMecanico() {
        reparacionMotor = new ReparacionMotor();
        cambioAceite = new CambioAceite();
    }

    public void realizarServicio() {
        reparacionMotor.repararMotor();
        cambioAceite.cambiarAceite();
    }
}

