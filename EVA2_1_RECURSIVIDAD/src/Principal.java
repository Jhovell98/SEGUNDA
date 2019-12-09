
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un numero ");
        Scanner sInput= new Scanner(System.in);
        int iVal = sInput.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
        System.out.println("-------------------");
        forFalso(iVal);
        System.out.println("");
        System.out.println("Ahora al reves ");
        forFalso2(iVal, 1);
    }
    public static void forFalso(int iVal) {
        System.out.print(iVal + " - ");
        if(iVal >1){
        forFalso(iVal - 1);
        }
    }
    public static void forFalso2(int iVal, int incremento){
        System.out.print(incremento + " - ");
        if (incremento<iVal) {
            forFalso2(iVal, incremento + 1);
        }
    }
    
}
