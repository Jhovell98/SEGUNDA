/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orlan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Fibi(8));
    }

    public static int Fibi(int iPos) {
        if (iPos == 0) {
            return 0;
        } else if (iPos == 1) {
            return 1;
        } else {
            return Fibi(iPos - 1) + Fibi(iPos - 2);
        }

    }//Final Método
}
