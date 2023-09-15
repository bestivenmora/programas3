
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karol
 */
class Peluqueria2 {
    private String nombre;
    private int corteCaballero;
    private int corteDama;
    private int tintura;
    private int peinado;
    private int precio1;
    private int precio2;
    private int precio3;
    private int precio4;
    private int precioTot;
    private int servTot;

    public Peluqueria2() {     
    }

    public Peluqueria2(String nombre, int corteCaballero, int corteDama, int tintura, int peinado, int precio1, int precio2, int precio3, int precio4) {
        this.nombre = nombre;
        this.corteCaballero = corteCaballero;
        this.corteDama = corteDama;
        this.tintura = tintura;
        this.peinado = peinado;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.precio4 = precio4;
    }  
    
    public String getNombre() {
        return nombre;
    }

    public int getCorteCaballero() {
        return corteCaballero;
    }

    public void setCorteCaballero(int corteCaballero) {
        this.corteCaballero += corteCaballero;
    }

    public int getCorteDama() {
        return corteDama;
    }

    public void setCorteDama(int corteDama) {
        this.corteDama += corteDama;
    }

    public int getTintura() {
        return tintura;
    }

    public void setTintura(int tintura) {
        this.tintura += tintura;
    }

    public int getPeinado() {
        return peinado;
    }

    public void setPeinado(int peinado) {
        this.peinado += peinado;
    }

    public int getPrecio1() {
        return precio1;
    }

    public void setPrecio1(int precio1) {
        this.precio1 += precio1;
    }

    public int getPrecio2() {
        return precio2;
    }

    public void setPrecio2(int precio2) {
        this.precio2 += precio2;
    }

    public int getPrecio3() {
        return precio3;
    }

    public void setPrecio3(int precio3) {
        this.precio3 += precio3;
    }

    public int getPrecio4() {
        return precio4;
    }

    public void setPrecio4(int precio4) {
        this.precio4 += precio4;
    }

    public int getPrecioTot() {
        return precioTot;
    }

    public void setPrecioTot(int precioTot) {
        this.precioTot += precioTot;
    }

    public int getServTot() {
        return servTot;
    }

    public void setServTot(int servTot) {
        this.servTot += servTot;
    }
    
    public void agregarServicio() {
        int tipoServicio = Integer.parseInt(JOptionPane.showInputDialog("Tipo de servicio \n 1. Corte Caballero\n 2. Corte Dama\n 3. Tintura\n 4. Peinado\n"));
        switch (tipoServicio) {
        case 1:
            setCorteCaballero(getCorteCaballero() + 1);
            precio1 += getCorteCaballero() * 8000;
            break;
        case 2:
            setCorteDama(getCorteDama() + 1);
             precio2 += getCorteDama() * 10500;
            break;
        case 3:
            setTintura(getTintura() + 1);
            precio3 += getTintura() * 40000;
            break;
        case 4:
            setPeinado(getPeinado() + 1);
            precio4 += getPeinado() * 15000;
            break;
        default:
    }
    
}
    public void calcularTotales() {
        precioTot=corteCaballero+corteDama+tintura+peinado;
        servTot=precio1+precio2+precio3+precio4;
    }
}