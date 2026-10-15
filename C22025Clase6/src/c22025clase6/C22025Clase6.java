/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Seleccion seleccion1 = new Seleccion();
        seleccion1.setName("Costa");
        JOptionPane.showMessageDialog(null, seleccion1.getName());
        seleccion1.setName("Cr");
        JOptionPane.showMessageDialog(null, seleccion1.getName());
        seleccion1.setName("CR");
        JOptionPane.showMessageDialog(null, seleccion1.getName());
        seleccion1.setMail(JOptionPane.showInputDialog("Digite un correo:"));
        JOptionPane.showMessageDialog(null, seleccion1.getMail());
        */
        
        Usuario usuario = new Usuario();
        JOptionPane.showConfirmDialog(null, usuario.getPwd());
        usuario.setPwd(JOptionPane.showInputDialog("Digite el pwd"));
        JOptionPane.showConfirmDialog(null, usuario.getPwd());
        Usuario usuario1 = new Usuario("papito1", "papacito");
        JOptionPane.showConfirmDialog(null, "El usuario "  + usuario1.getUser() + " tiene el pwd "+ usuario1.getPwd());
        
        
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setEstado(Estado.Activo);
        Cuenta cuenta2 = new Cuenta("ASDasdsad", Estado.pendiente);
        
        JOptionPane.showMessageDialog(null, cuenta2.toString());
        JOptionPane.showMessageDialog(null, cuenta1.toString());
        
    }
    
}
