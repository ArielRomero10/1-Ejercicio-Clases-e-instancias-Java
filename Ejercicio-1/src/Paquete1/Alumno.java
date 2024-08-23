/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Ariel
 */
public class Alumno {
    
    private String nombre;
    private String apellido;
    private int dniAlumno;

    //CONSTRUCTOR
    public Alumno(String nombreParametro, String apellidoParametro, int dniAlumnoParametro) {  
        
        nombre = nombreParametro;
        apellido = apellidoParametro;
        dniAlumno = dniAlumnoParametro;
        
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(int dniAlumno) {
        this.dniAlumno = dniAlumno;
    }
}
