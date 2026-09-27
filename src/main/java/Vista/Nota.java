/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.JOptionPane;
import logica.calculadora;
/**
 *
 * @author Daniel Alejandro
 */
public class Nota {
    public static void main (String[] args){
        String Nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        String Codigo = JOptionPane.showInputDialog("Ingresa tu codigo: ");
        String Carrera = JOptionPane.showInputDialog("Ingresa tu carrera: ");
        double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu nota matematica: "));
        double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu nota de desarrollo: "));
        String aprobo=null;
        calculadora Def = new calculadora(Codigo, Nombre, Carrera, notaDesarrollo, notaMatematica);
        
        double definitiva = Def.calculadoraDefinitiva();
        
        if (definitiva>=3.5){
            aprobo="Si felicidades";
        }else{
            aprobo="No juas juas";
        }
            
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nID: " + Codigo + "\nNota Definitiva: " + definitiva + "\n¿Aprobo?: " + aprobo);
    }
}
