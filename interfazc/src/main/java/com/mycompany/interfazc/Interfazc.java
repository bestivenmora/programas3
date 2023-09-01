/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class Interfazc extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField pg,pp,pm,h;
    JButton b1;
   

    public static void main(String[] args) {
        Interfazc codificada = new Interfazc();
    }
    
    public Interfazc(){
        
        setBounds(100, 100, 500, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        l6 = new JLabel("                                 ");
        l1 = new JLabel("Perro grande: ");
        l6 = new JLabel("                                 ");
        l2 = new JLabel("Perro mediano: ");
        l6 = new JLabel("                                 ");
        l3 = new JLabel("Perro pequeño: ");
        l4 = new JLabel("Guarderia de mascotas.");
        l5 = new JLabel("Cantidad de horas");
        b1 = new JButton("precio");
        b1.addActionListener(this);
        pg = new JTextField(10);
        pm = new JTextField(10);
        pp = new JTextField(10);
        h = new JTextField(10);
        add(l4);    
        add(l1);
        add(pg);
        add(l6);
        add(l2);
        add(l6);
        add(pm);
        add(l3);
        add(pp);
        add(l6);
        add(l5);
        add(h);
        add(b1);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        int p = Integer.parseInt(pp.getText());
        int m = Integer.parseInt(pm.getText());
        int g= Integer.parseInt(pg.getText());
        int ho = Integer.parseInt(h.getText());
        int costo =Integer.parseInt(pp.getText())*3000 + Integer.parseInt(pm.getText())*5000 +
                Integer.parseInt(pg.getText())*10000 ;
        int total = Integer.parseInt(pg.getText()) + Integer.parseInt(pp.getText()) +Integer.parseInt(pm.getText()) ;
        int precio = costo * Integer.parseInt(h.getText());
        if(accion.equals("precio")){
            
             if (total >1) {
                 int descuento = precio-(precio/10);
                 JOptionPane.showMessageDialog(this, "El costo con descuento es de"
                           + ":"+descuento);
                   
         }if (total == 1){
             JOptionPane.showMessageDialog(this, """
                                                 Solo ha digitado un perro, no hay descuento.
                                                 El precio es: """+precio);
         }
        }
    }
    
}
    
