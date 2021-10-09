/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import formula1.controladores.Controlador;
import formula1.modelos.ModeloBD;
import formula1.vistas.Vista;

/**
 *
 * @author 505
 */
public class Formula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeloBD modelo = new ModeloBD();
        Vista vista = new Vista();
        vista.setVisible(true);
        Controlador controlador = new Controlador(modelo,vista);
        
        
    }
    
}
