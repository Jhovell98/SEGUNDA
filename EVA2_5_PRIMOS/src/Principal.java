
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un valor ");
        int x= leer.nextInt();
    }
    public boolean PrimoIneficiente(long iVal){
        boolean res = false;
        for (int i = 2; i < iVal; i++) {
            if ((iVal % res)==0){
                res=false;
            }
        }
        return res;
    }
}
