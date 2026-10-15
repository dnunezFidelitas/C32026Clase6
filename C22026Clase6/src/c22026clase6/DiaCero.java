/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22026clase6;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class DiaCero {
    
    public void generaDiaCero(){
        Crosfit claseManana = new Crosfit();
        Crosfit claseNoche = new Crosfit();
        Crosfit clasetarde = new Crosfit();
        
        JOptionPane.showMessageDialog(null, claseManana.toString());
        JOptionPane.showMessageDialog(null, claseNoche.toString());
        JOptionPane.showMessageDialog(null, clasetarde.toString());
        
        Instructor juanito = new Instructor(1, "Juan Perez", 400000.00, 10000.00);
        Instructor instructor2 = new Instructor(1, "Julia Gonzalez", 450000.00, 11000.00);
        Instructor instructor3 = new Instructor(1, "Beto le presta", 300000.00, 5000.00);
        
        Crosfit clasePractica1 = new Crosfit(1, 30, new Date(), "Como le profe desee", juanito);
        
        JOptionPane.showMessageDialog(null, clasePractica1.toString());
                
    }
    
}
