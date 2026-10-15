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
public class Usuario {
    //atributos
    private String user;
    public static String variableStatic ="El valor por default";
    private String pwd;

    //consutructor
    public Usuario() {
        pwd="123";
    }

    public Usuario(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }
    
    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        String result="";
        for (int i = 0; i < pwd.length(); i++) {
            result+="*";
        }
        return result;
    }

    public void setPwd(String pwd) {
        if(pwd.length()<8){
            JOptionPane.showConfirmDialog(null, "Este pwd no es valido");
        }else
        this.pwd = pwd;
    }
    
    
    
}
