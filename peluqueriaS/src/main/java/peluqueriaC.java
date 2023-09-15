/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karol
 */
class peluqueriaC {
    private String nombre;
    private int corteCaballero;
    private int corteDama;
    private int tintura;
    private int peinado;

    public peluqueriaC() {     
    }

    public peluqueriaC(String nombre, int corteCaballero, int corteDama, int tintura, int peinado) {
        this.nombre = nombre;
        this.corteCaballero = corteCaballero;
        this.corteDama = corteDama;
        this.tintura = tintura;
        this.peinado = peinado;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getCorteCaballero() {
        return corteCaballero;
    }

    public void setCorteCaballero(int corteCaballero) {
        this.corteCaballero = corteCaballero;
    }

    public int getCorteDama() {
        return corteDama;
    }

    public void setCorteDama(int corteDama) {
        this.corteDama = corteDama;
    }

    public int getTintura() {
        return tintura;
    }

    public void setTintura(int tintura) {
        this.tintura = tintura;
    }

    public int getPeinado() {
        return peinado;
    }

    public void setPeinado(int peinado) {
        this.peinado = peinado;
    }
}