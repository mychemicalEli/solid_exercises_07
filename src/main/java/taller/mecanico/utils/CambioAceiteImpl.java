package taller.mecanico.utils;

import taller.mecanico.interfaces.CambioAceite;

public class CambioAceiteImpl implements CambioAceite {
    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando aceite...");
    }
}
