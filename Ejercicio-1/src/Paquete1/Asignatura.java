/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Ariel
 */
public class Asignatura {
    
    private String nombreMateria;
    private String hora;
    private String dia;    

    public Asignatura(String nombreMateria, String hora, String dia) {
        this.nombreMateria = nombreMateria;
        this.hora = hora;
        this.dia = dia;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

     
}
