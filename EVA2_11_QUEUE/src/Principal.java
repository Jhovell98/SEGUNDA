/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */

import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola objCola = new Cola();
        objCola.Add(new Nodo(100));
        objCola.Add(new Nodo(200));
        objCola.Add(new Nodo(300));
        objCola.Add(new Nodo(400));
        try {
            System.out.println(objCola.leerNodo());
            objCola.quitarNodo();
            System.out.println(objCola.leerNodo());
            objCola.quitarNodo();
            System.out.println(objCola.leerNodo());
            objCola.quitarNodo();
            System.out.println(objCola.leerNodo());
            objCola.quitarNodo();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
