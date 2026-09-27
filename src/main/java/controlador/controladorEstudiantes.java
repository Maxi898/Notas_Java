/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import logica.calculadora;

/**
 *
 * @author Daniel Alejandro
 */
public class controladorEstudiantes {

    private calculadora[] estudiantes;
    private int numEstudiantes;


    public void iniciarProceso() {
        pedirNumeroEstudiantes();
        registrarEstudiantes();
        mostrarReporte();

        double notaLimite = pedirNotaLimite();
        mostrarEstudiantesTecnologiasSuperiores(notaLimite);

        double incremento = pedirIncremento();
        incrementarNotasDesarrollo(incremento);

        JOptionPane.showMessageDialog(null, "Se aplico el incremento de " + incremento
                + " a la nota de desarrollo de todos los estudiantes.");
    }

    private void pedirNumeroEstudiantes() {
        numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes: "));
        estudiantes = new calculadora[numEstudiantes];
    }


    private void registrarEstudiantes() {
        for (int i = 0; i < numEstudiantes; i++) {
            String codigo = JOptionPane.showInputDialog("Estudiante " + (i + 1) + " - Ingrese el codigo: ");
            String nombre = JOptionPane.showInputDialog("Estudiante " + (i + 1) + " - Ingrese el nombre: ");
            String carrera = JOptionPane.showInputDialog("Estudiante " + (i + 1) + " - Ingrese la carrera: ");
            double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Estudiante " + (i + 1) + " - Ingrese la nota matematica: "));
            double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Estudiante " + (i + 1) + " - Ingrese la nota de desarrollo: "));

            calculadora estudiante = new calculadora(codigo, nombre, carrera, notaDesarrollo, notaMatematica);
            estudiante.calculadoraDefinitiva();
            estudiantes[i] = estudiante;
        }
    }


    private void mostrarReporte() {
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes[i].mostrarNota();
        }
    }


    private double pedirNotaLimite() {
        double notaLimite;
        do {
            notaLimite = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la notaLimite (entre 0.0 y 4.9): "));
        } while (notaLimite < 0.0 || notaLimite > 4.9);
        return notaLimite;
    }

    private void mostrarEstudiantesTecnologiasSuperiores(double notaLimite) {
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes[i].mostrarSiSuperaLimite(notaLimite);
        }
    }

    private double pedirIncremento() {
        double incremento;
        do {
            incremento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cifra de incremento (entre 0.0 y 0.5): "));
        } while (incremento < 0.0 || incremento > 0.5);
        return incremento;
    }

    private void incrementarNotasDesarrollo(double incremento) {
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes[i].incrementarNotaDesarrollo(incremento);
        }
    }
}
