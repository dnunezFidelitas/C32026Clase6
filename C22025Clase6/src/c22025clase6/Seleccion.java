/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Seleccion {
    //atributos
    private String name;
    private String shield;
    private String namePlayer1;
    private String namePlayer2;
    private String mail;
    private String couch;
    
    //Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.compareTo("CR")==0){
            name="Costa Rica";
        }
            
        this.name = name;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String getNamePlayer1() {
        return namePlayer1;
    }

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }

    public String getMail() {
        return mail.substring(0, 3) + "....."+ mail.substring(mail.indexOf("@"));
    }

    public void setMail(String mail) {
        if (!mail.contains("@")){
            JOptionPane.showMessageDialog(null, "Este correo no es valido "+ mail);
            mail="";
            
        }
        //mail.length()
        this.mail = mail;
    }

    public String getCouch() {
        return couch;
        //int a =0;
    }

    public void setCouch(String couch) {
        this.couch = couch;
    }
 
    //juanito123456; mail.length() 13
    //1944guerra 10
}
