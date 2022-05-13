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
        celular iphone = new celular();
        
        
        
        
        cell.celularAleatorio();
        telefonito.celularAleatorio();
        iphone.celularAleatorio();
       
        
        cell.setAlmacenamiento(64);
        cell.ram(10);
        
        cell.power();
        cell.almacenamiento(24);
        
        cell.especificaciones();

        
      
        /*
        System.out.println("El costo del celular es de: $" + cell.getPrecio() + " pesos.");
        System.out.println("El alamacenamiento interno del celular es de: "+ cell.getAlmacenamiento());
        System.out.println("La memoria RAM del celular es de: "+ cell.getRam() + " GB");
        System.out.println("El tamaño del celular en pulgadas es de: " + cell.getTamano());
        System.out.println("Los megapixeles de las camaras son: " + cell.getCamaraF() +" MP en la frontal y " + cell.getCamaraT() +" MP en la trasera");
        System.out.println("El celular es de color " + cell.getColor());
        System.out.println("La capacidad de la bateria es de: " + cell.getCapacidadBateria() + " mh");
        System.out.println("El puerto de carga del celular es :" + cell.getPuertoCarga());
        System.out.println("La salida de audio del celular es: salida " + cell.getSalidaAudio());
        System.out.println("El altavoz del celular es " + cell.getAltavoz());
        System.out.println("El celular "+(cell.getLector()? "si" : "no")+" tiene lector de huella");
        System.out.println("El celular es marca " + cell.getMarca());      
        System.out.println("");
        */
    }
    
}
