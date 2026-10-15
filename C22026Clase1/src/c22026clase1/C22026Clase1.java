/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22026clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22026Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // dsfgdsfasda
        /*
        
        esto es codigo comentado
         */
        //hkkjghkhklhj control + shift + C para comentar

        // Vamos a iniciar con declaraciones tipo + identificador unico
        String variable1;
        // int variable1; esto es un error no puedo tener dos variables iguales
        int variableUno; // toda variable inicia en minuscula y utilizamos camelCase
        String vAriable1;
        variable1 = "Esto es el valor que lleva este texto";
        double miData;

        //miData = 0.0;
        JOptionPane.showMessageDialog(null, variable1);
        //JOptionPane.showMessageDialog(null, miData);     esto da error pq la variable no esta inicializada
        //buenas practicas vamos a declarar e inicializar
        JOptionPane.showMessageDialog(null, "" + "");
        JOptionPane.showMessageDialog(null, "primer texto" + " segundo texto");
        JOptionPane.showMessageDialog(null, "primer texto" + "\nsegundo texto");
        
        int edad=0;
        String edadString="";
        edadString=JOptionPane.showInputDialog("Digita la edad para tomar alcohol");
        edad = Integer.parseInt(edadString);
        edad +=3;
        edadString +=3;
        JOptionPane.showMessageDialog(null, edad);
        JOptionPane.showMessageDialog(null, edadString);
       
    }
//    if (1==1){ Esto genera une error pq esta fuera de las llaves
//
//    }

}
