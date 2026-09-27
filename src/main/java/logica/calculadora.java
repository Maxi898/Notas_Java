/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel Alejandro
 */
public class calculadora {
    private String id;
    private String nombre;
    private String carrera;
    private double notaDesarrollo;
    private double notaMatematica;
    private double definitiva;
    private String aprobo;

    public calculadora(String id, String nombre, String carrera, double notad, double notam) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.notaDesarrollo = notad;
        this.notaMatematica = notam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getDefinitiva() {
        return definitiva;
    }

 
    public double calculadoraDefinitiva() {
        definitiva = notaMatematica * 0.4 + notaDesarrollo * 0.6;
        if (definitiva >= 3.5) {
            aprobo = "Si felicidades";
        } else {
            aprobo = "No juas juas";
        }
        return definitiva;
    }


    public void mostrarNota() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre
                + "\nID: " + id
                + "\nCarrera: " + carrera
                + "\nNota Definitiva: " + definitiva
                + "\n¿Aprobo?: " + aprobo);
    }


    public void mostrarSiSuperaLimite(double notaLimite) {
        if (carrera != null && carrera.equalsIgnoreCase("Tecnologias") && definitiva > notaLimite) {
            JOptionPane.showMessageDialog(null,
                    "Estudiante de Tecnologias con definitiva > " + notaLimite
                    + "\nCodigo: " + id
                    + "\nNombre: " + nombre
                    + "\nNota Definitiva: " + definitiva);
        }
    }


    public void incrementarNotaDesarrollo(double incremento) {
        if (notaDesarrollo + incremento > 5.0) {
            incremento = 5.0 - notaDesarrollo;
        }
        notaDesarrollo = notaDesarrollo + incremento;
    }
}
