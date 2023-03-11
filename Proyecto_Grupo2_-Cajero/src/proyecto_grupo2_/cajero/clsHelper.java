/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_grupo2_.cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author cihc2
 */
public class clsHelper {
        public int recibeInt(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        int valor = Integer.parseInt(auxiliar);
        return valor;
    }
        public float recibeFloat(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        float valor = Float.parseFloat(auxiliar);
        return valor;
    }
        public char recibeChar(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        char valor = auxiliar.toUpperCase().charAt(0);
        return valor;
    }
        public String recibeString(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        return auxiliar;
    }
        public void imprimeMensaje(String mensajeImprimir){
            JOptionPane.showMessageDialog(null, mensajeImprimir);
        }
}
