/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Sanabria
 */
public class Entrenadores extends Miembros{
    private int contrato;
    private int cantidad_c;

    public Entrenadores(int contrato, int cantidad_c) {
        this.contrato = contrato;
        this.cantidad_c = cantidad_c;
    }

    public Entrenadores(int contrato, int cantidad_c, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.contrato = contrato;
        this.cantidad_c = cantidad_c;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getCantidad_c() {
        return cantidad_c;
    }

    public void setCantidad_c(int cantidad_c) {
        this.cantidad_c = cantidad_c;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
