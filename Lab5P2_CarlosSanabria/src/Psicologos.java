/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Sanabria
 */
public class Psicologos extends Miembros{
    private String Titulo;
    private String ID;
    private String Especialidad;
    private int cantidad_infor=0;
    private int cantidad_de_jugadores=0;

    public Psicologos(String Titulo, String ID, String Especialidad) {
        this.Titulo = Titulo;
        this.ID = ID;
        this.Especialidad = Especialidad;
     ;
    }

    public Psicologos(String Titulo, String ID, String Especialidad, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.Titulo = Titulo;
        this.ID = ID;
        this.Especialidad = Especialidad;
        ;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getCantidad_infor() {
        return cantidad_infor;
    }

    public void setCantidad_infor(int cantidad_infor) {
        this.cantidad_infor = cantidad_infor;
    }

    public int getCantidad_de_jugadores() {
        return cantidad_de_jugadores;
    }

    public void setCantidad_de_jugadores(int cantidad_de_jugadores) {
        this.cantidad_de_jugadores = cantidad_de_jugadores;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
