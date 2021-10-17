/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ucm.poker02p.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
//import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.ucm.poker02p.control.Controller;
import org.ucm.poker02p.model.Mano;
import org.ucm.poker02p.model.Observer;
import org.ucm.poker02p.model.Rango;

/**
 *
 * @author seiya
 */
public class PanelRango extends JTextArea implements Observer{

    private Rango rango;
    private Controller cntr;
    public PanelRango(Controller cntr) {
        
        
        rango = new Rango(cntr);
        cntr.addObserver(this);
        setSize(new Dimension(360, 90));
        setLocation(5, 5);
        setBackground(Color.WHITE);
        this.setVisible(true);
        this.setText(rango.toString());
        
    }
    
    
    @Override
    public void onRegister() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onReset() {
        //this.setText(rango.toString());
    }

    @Override
    public void onRangeChanged(ArrayList<Mano> lista) {
        this.setText(rango.toString());
        
    }

    @Override
    public void onAdvance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onCuadritoChanged(Mano mano, boolean seleccionado) {
        //this.setText(rango.toString());
        //me cago en los muertos del set text
    }
    
}