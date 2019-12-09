
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Lista miLista = new Lista();
            miLista.add(new Nodo(4));
            miLista.add(new Nodo(5));
            miLista.add(new Nodo(4));
            miLista.add(new Nodo(3));
            miLista.add(new Nodo(2));
            miLista.add(new Nodo(1));
            miLista.addBegin(new Nodo(5555));
            boolean vacia= miLista.isEmpty();
            if (vacia) {
                System.out.println("Lista vacia ");
            }else{
                System.out.println("Lista con nodos");
            }
            
            miLista.print();
        try {
            miLista.deleteAt(0);
            /*for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo((int)(Math.random()*1000)));
            }
            System.out.println("Cantidad = " + miLista.size());*/
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            miLista.deleteAt(0);
            miLista.print();
            miLista.add(new Nodo(200));
            miLista.print();
            miLista.deleteAt(5);
            miLista.print();
            miLista.add(new Nodo(300));
            
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("El valor de la posición 3 es " + miLista.getAt(3));
        
    }
    
}
