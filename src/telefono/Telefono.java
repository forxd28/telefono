/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefono;

/**
 *
 * @author eleo_
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        celular cell = new celular();
        celular telefonito = new celular();
        
        
        cell.celularAleatorio();
        telefonito.celularAleatorio();
        
       
        
        cell.setAlmacenamiento(64);
        cell.ram(10);
        
        cell.power();
        cell.almacenamiento(24);
        
        cell.especificaciones();
    }
    
}
