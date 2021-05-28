/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Sanabria
 */
public class Jugadores extends Miembros{
    private int numero_de_j;
    private int cantidad_p=0;
    private int tarje_ame=0;
    private int tarje_rojo=0;
    private int contrato;

    public Jugadores(int numero_de_j, int contrato) {
        this.numero_de_j = numero_de_j;
        this.contrato = contrato;
    }

    public Jugadores(int numero_de_j, int contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.numero_de_j = numero_de_j;
        this.contrato = contrato;
    }

    public int getNumero_de_j() {
        return numero_de_j;
    }

    public void setNumero_de_j(int numero_de_j) {
        this.numero_de_j = numero_de_j;
    }

    public int getCantidad_p() {
        return cantidad_p;
    }

    public void setCantidad_p(int cantidad_p) {
        this.cantidad_p = cantidad_p;
    }

    public int getTarje_ame() {
        return tarje_ame;
    }

    public void setTarje_ame(int tarje_ame) {
        this.tarje_ame = tarje_ame;
    }

    public int getTarje_rojo() {
        return tarje_rojo;
    }

    public void setTarje_rojo(int tarje_rojo) {
        this.tarje_rojo = tarje_rojo;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
