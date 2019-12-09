/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Arbol {
   private Nodo root;
   
     public void agregarNodo(Nodo nuevo){
         agregarNodoRec(root, nuevo);
     }
       private void agregarNodoRec(Nodo actual, Nodo nuevo){
       if(root==null){//Arbol vacío
       root=nuevo;
       }else{
           if(nuevo.getValor()>actual.getValor()){//Mayor a la derecha
               if(actual.getDerecha()==null){//Está vacío, hay espacio
               actual.setDerecha(nuevo);
               }else{//Ya hay un nodo a la derecha 
                   agregarNodoRec(actual.getDerecha(),nuevo);
               }
           }else if(nuevo.getValor()<actual.getValor()){//Menor a la izquierda
               if(actual.getDerecha()==null){//Está vacío, hay espacio
               actual.setDerecha(nuevo);
               }else{//Ya hay un nodo a la derecha 
                   agregarNodoRec(actual.getIzquierda(),nuevo);
               }
           }else{//El valor es igual
               System.out.println("UPS! YA EXISTE EL VALOR ");
           } 
       }
   
   }//Aqui cierra el método
       public void imprimePostOrder(){
           postOrder(root);
       }
       private void postOrder(Nodo actual){
         if (actual!=null) {
         //Leer izquierda
          postOrder(actual.getIzquierda());
         //Leer derecha
         postOrder(actual.getDerecha());
         //Imprimir
         System.out.print(actual.getValor() + "-");
         }
       }//Final PostOrder
       public void imprimeInOrder(){
           inOrder(root);
       }
       public void inOrder(Nodo actual){
        if (actual!=null) {
         //Leer izquierda
          inOrder(actual.getIzquierda());
          //Imprimir
         System.out.print(actual.getValor() + "-");
         //Leer derecha
         inOrder(actual.getDerecha());
         
         }
       }//Final inOrder
       public void imprimePreOrder(){
           preOrder(root);
       }
       public void preOrder(Nodo actual){
           if (actual!=null) {
               //Imprimir
               System.out.println(actual.getValor() + "-");
               //Leer izquierda
               preOrder(actual.getIzquierda());
               //Leer derecha
               preOrder(actual.getDerecha());
           }
    }
       
       
}//Aqui cierra la clase árbol
