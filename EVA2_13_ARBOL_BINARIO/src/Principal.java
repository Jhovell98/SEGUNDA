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
        // TODO code application logic here
        Arbol miArbol = new Arbol();
        //miArbol.agregarNodo(new Nodo(50)); //2,11,10,20,18,13
        miArbol.agregarNodo( new Nodo(50));
        miArbol.agregarNodo( new Nodo(40));
        miArbol.agregarNodo( new Nodo(60));
        miArbol.agregarNodo( new Nodo(50));
        System.out.println("Post order");
        System.out.println("");
        miArbol.imprimePostOrder();
        System.out.println("");
        System.out.println("In Order");
        miArbol.imprimeInOrder();
        System.out.println("");
        System.out.println("Imprime pre orden");
        miArbol.imprimePreOrder();
               
               
    }
    
    
}
