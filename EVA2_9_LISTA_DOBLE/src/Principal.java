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
        ListaDoble miLista = new ListaDoble();
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        System.out.println("Imprimir al revés");
        miLista.printBack();
        System.out.println("Imprimir lista normal ");
        miLista.printList();
        System.out.println("Agregar nodo al inicio y al final");
        miLista.addBegin(new Nodo(989898));
        miLista.add(new Nodo(55555));
        miLista.printList();
        try {
            System.out.println("Insertar en la posición 4");
            miLista.insertAt(4, new Nodo(44444));
            System.out.println(miLista.getAt(4));
            System.out.println("Nodo en posición 3");
            System.out.println(miLista.getAt(3));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Lista normal ");
        miLista.printList();
        try {
            System.out.println("Borrar nodo 3");
            miLista.deleteAt(3);
            
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Lista depues de los cambios ");
        miLista.printList();
    }
    
}