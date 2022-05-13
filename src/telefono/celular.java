/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefono;

import java.util.Random;

/**
 *
 * @author eleo_
 */
public class celular {
    private double precio;
    private int almacenamiento;
    private int ram;
    private double tamano;
    private int camaraF;
    private int camaraT;
    private String color;
    private int capacidadBateria;
    private String puertoCarga;
    private String salidaAudio;
    private String altavoz;
    private boolean lector;
    private String marca;
    
    private boolean encendido;
    
    public celular(){
        this.precio = 2999.99;
        this.almacenamiento = 16;
        this.ram = 2;
        this.tamano = 5.81;
        this.camaraF = 12;
        this.camaraT = 12;
        this.color = "Aurora";
        this.capacidadBateria = 2900;
        this.puertoCarga = "Micro USB";
        this.salidaAudio = "3.5mm";
        this.altavoz = "DolbyAttmos";
        this.lector = false;
        this.marca = "Honor";
        this.encendido = true;
    }
    public void celularAleatorio(){
        int n1;
        int []num = new int[13];
        Random rnd = new Random();
        for(int i = 0; i < 13; i++){
            n1 = rnd.nextInt(3);
            num[i] = n1;
        }
        switch(num[0]){
            case 0:
                this.precio = 4999.99;
                break;
            case 1:
                this.precio = 5999.99;
                break;
            case 2:
                this.precio = 6999.99;
                break;
            default:
                break;
        }
        switch(num[1]){
            case 0:
                this.almacenamiento = 128;
                break;
            case 1:
                this.almacenamiento = 64;
                break;
            case 2:
                this.almacenamiento = 32;
                break;
            default:
                break;
        }
        switch(num[2]){
            case 0:
                this.ram = 8;
                break;
            case 1:
                this.ram = 6;
                break;
            case 2:
                this.ram = 4;
                break;
            default:
                break;
        }
        switch(num[3]){
            case 0:
                this.tamano = 6.15;
                break;
            case 1:
                this.tamano = 6.24;
                break;
            case 2:
                this.tamano = 6.57;
                break;
            default:
                break;
        }
        switch(num[4]){
            case 0:
                this.camaraF = 24;
                break;
            case 1:
                this.camaraF = 16;
                break;
            case 2:
                this.camaraF = 8;
                break;
            default:
                break;
        }
        switch(num[5]){
            case 0:
                this.camaraT = 48;
                break;
            case 1:
                this.camaraT = 24;
                break;
            case 2:
                this.camaraT = 16;
                break;
            default:
                break;
        }
        switch(num[6]){
            case 0:
                this.color = "Azul";
                break;
            case 1:
                this.color = "Rojo";
                break;
            case 2:
                this.color = "Negro";
                break;
            default:
                break;
        }
        switch(num[7]){
            case 0:
                this.capacidadBateria = 3000;
                break;
            case 1:
                this.capacidadBateria = 3500;
                break;
            case 2:
                this.capacidadBateria = 4000;
                break;
            default:
                break;
        }
        /*switch(num[8]){
            default:
                break;
        }
        switch(num[9]){
            default:
                break;
        }
        switch(num[10]){
            default:
                break;
        }
        switch(num[11]){
            default:
                break;
        }*/
        switch(num[12]){
            case 0:
                this.marca = "Huawei";
                break;
            case 1:
                this.marca = "Xiaomi";
                break;
            case 2:
                this.marca = "Samsung";
                break;
            default:
                break;
        }
        if(num[8]%2 != 0)
            this.puertoCarga = "MicroUSB";
        else
            this.puertoCarga = "Type C";
        
        if(num[9]%2 != 0)
            this.salidaAudio = "3.5mm";
        else
            this.salidaAudio = "Type C";
        
        if(num[10]%2 != 0)
            this.altavoz = "stereo";
        else
            this.altavoz = "Dolby";
        
        this.lector = num[11]%2 != 0; 
        
        //this.almacenamiento = 128;
        //this.ram = 6;
        //this.tamano = 6.57;
        //this.camaraF = 16;
        //this.camaraT = 24;
        //this.color = "negro";
        //this.capacidadBateria = 4500;
        //this.puertoCarga = "Tipo C";
        //this.salidaAudio = "3.5";
        //this.altavoz = "stereo";
        //this.lector = true;
        //this.marca = "Huawei";
    
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio<1000)
            this.precio = 1000;
        else if(precio > 12000)
            this.precio = 12000;
        else
            this.precio = precio;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        if(almacenamiento < 16)
            this.almacenamiento = 16;
        else if(almacenamiento > 256)
            this.almacenamiento = 256;
        else
            if((almacenamiento % 2 != 0)||(almacenamiento % 3 == 0)){
                int contador = 0; 
                do{
                    almacenamiento = almacenamiento / 2;
                    contador++;
                }while(almacenamiento != 2 && almacenamiento != 3);
                
                almacenamiento = (int) Math.pow(2, (contador + 2));
                this.almacenamiento = almacenamiento;
            }    
            else if((almacenamiento % 2 == 0)||(almacenamiento % 3 != 0)){
                int contador = 0; 
                do{
                    almacenamiento = almacenamiento / 2;
                    contador++;
                }while(almacenamiento != 2 && almacenamiento != 3);
                
                almacenamiento = (int) Math.pow(2, (contador + 2));
                this.almacenamiento = almacenamiento;
            }
            else
                this.almacenamiento = almacenamiento;
    }
    
    public void almacenamiento (int almacenamiento){
        int []datos = {16, 32, 64, 128, 256};
        if(almacenamiento < datos[0])
            this.almacenamiento = datos[0];
        else if(almacenamiento > datos[4])
            this.almacenamiento = datos[4];
        else{
            for(int i = 1; i < datos.length; i++){
                if(almacenamiento > datos[i-1] && almacenamiento < datos[i]){
                    this.almacenamiento = datos[i];
                    break;
                }  
            }
        }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram < 1)
            this.ram = 1;
        else if(ram > 16)
            this.ram = 16;
        else
            if((ram % 2 != 0)||(ram % 3 == 0)){
                int contador = 0;
                
                while(ram != 2 && ram != 3){
                    ram = ram / 2;
                    contador++;
                }
                ram = (int) Math.pow(2, (contador + 2));
                this.ram = ram;
            }    
            else
                this.ram = ram;
    }
    
    public void ram(int ram) {
        int []datos = {1, 2, 4, 8, 16};
        if(ram < datos[0])
            this.ram = datos[0];
        else if(ram > datos[4])
            this.ram = datos[4];
        else{
            for(int i = 1; i < datos.length; i++){
                if(ram > datos[i-1] && ram < datos[i]){
                    this.ram = datos[i];
                    break;
                }           
            }
        }    
    }
    

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        if(tamano < 5.50)
            this.tamano = 5.50;
        else if(tamano > 7.00)
            this.tamano = 7.00;
        else
            this.tamano = tamano;
    }

    public int getCamaraF() {
        return camaraF;
    }

    public void setCamaraF(int camaraF) {
        this.camaraF = camaraF;
    }

    public int getCamaraT() {
        return camaraT;
    }

    public void setCamaraT(int camaraT) {
        this.camaraT = camaraT;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        if(capacidadBateria < 2000)
            this.capacidadBateria = 2000;
        else if(capacidadBateria > 6000)
            this.capacidadBateria = 6000;
        else
            this.capacidadBateria = capacidadBateria;
    }

    public String getPuertoCarga() {
        return puertoCarga;
    }

    public void setPuertoCarga(String puertoCarga) {
        this.puertoCarga = puertoCarga;
    }

    public String getSalidaAudio() {
        return salidaAudio;
    }

    public void setSalidaAudio(String salidaAudio) {
        this.salidaAudio = salidaAudio;
    }

    public String getAltavoz() {
        return altavoz;
    }

    public void setAltavoz(String altavoz) {
        this.altavoz = altavoz;
    }

    public boolean getLector() {
        return lector;
    }

    public void setLector(boolean lector){
        this.lector = lector;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    
    
    public void power(){
        this.encendido = !this.encendido;
    }
    
    public String estadoPower(){
        return "El celular esta " + (this.encendido ? "encendido" : "apagado");
    }
    
    public void especificaciones(){
        System.out.println("El costo del celular es de: $" + precio + " pesos.");
        System.out.println("El alamacenamiento interno del celular es de: "+ almacenamiento);
        System.out.println("La memoria RAM del celular es de: "+ ram + " GB");
        System.out.println("El tamaño del celular en pulgadas es de: " + tamano);
        System.out.println("Los megapixeles de las camaras son: " + camaraF +" MP en la frontal y " + camaraT +" MP en la trasera");
        System.out.println("El celular es de color " + color);
        System.out.println("La capacidad de la bateria es de: " + capacidadBateria + " mh");
        System.out.println("El puerto de carga del celular es :" + puertoCarga);
        System.out.println("La salida de audio del celular es: salida " + salidaAudio );
        System.out.println("El altavoz del celular es " + altavoz);
        System.out.println("El celular "+(lector? "si" : "no")+" tiene lector de huella");
        System.out.println("El celular es marca " + marca);
        System.out.println(this.estadoPower());
        System.out.println("");
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "El costo del celular es de: $" + precio + " pesos."
                + "El alamacenamiento interno del celular es de: "+ almacenamiento
                + "La memoria RAM del celular es de: "+ ram + " GB"
                + "El tamaño del celular en pulgadas es de: " + tamano
                + "Los megapixeles de las camaras son: " + camaraF +" MP en la frontal y " + camaraT +" MP en la trasera"
                + "El celular es de color " + color
                + "La capacidad de la bateria es de: " + capacidadBateria + " mh"
                + "El puerto de carga del celular es :" + puertoCarga
                + "La salida de audio del celular es: salida " + salidaAudio 
                + "El altavoz del celular es " + altavoz
                + "El celular "+(lector? "si" : "no")+" tiene lector de huella"
                + "El celular es marca " + marca
                + encendido;
    }
}