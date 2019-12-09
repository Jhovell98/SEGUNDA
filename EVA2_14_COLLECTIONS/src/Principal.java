
import java.util.LinkedList;

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
        LinkedList<String> lListaEnLa= new LinkedList<String>();
        lListaEnLa.add("Hola");
        lListaEnLa.add("");
        lListaEnLa.add("Mundo");
        lListaEnLa.add("");
        lListaEnLa.add("Cruel");
        lListaEnLa.add("!!!!");
        lListaEnLa.addFirst("xxxxxx");
        lListaEnLa.add(3,"Jajas");
        System.out.println(lListaEnLa);
        for (String string : lListaEnLa) {
            System.out.print(string + "-");
        }
        System.out.println("");
        System.out.println("La cantidad de elementos es " + lListaEnLa.size());
        lListaEnLa.remove(3);
        System.out.println(lListaEnLa);
               
    }
}
