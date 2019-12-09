/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class ListaDoble {
     private Nodo inicio;
   private Nodo fin;
    public ListaDoble(){
    this.inicio=null;
    this.fin=null;
    }
    public void add(Nodo nuevo){
    //Verificar si hay o no nodos
    if(isEmpty()){
    inicio=nuevo;
    fin=nuevo;
    }else{
    fin.setSiguiente(nuevo);//Hacia adelante
    nuevo.setPrevio(fin);//Hacia atras
    fin=nuevo;
      }
    }
    public boolean isEmpty(){
    if(inicio==null){
    return true;
    }else 
        return false;
    }
     public void printBack(){ //Imprimir lista de fin a inicio
    Nodo temp= fin;
        while (temp!=null) {            
            System.out.print(temp.getValor() + "-");
            temp= temp.getPrevio();
        }
        System.out.println("");
        
        }
     //Imprimir lista Normalmente 
     public void printList(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    //Tamaño de la lista
    public int size(){
    int iCont=0;    
    Nodo temp= inicio;
        while (temp!=null) {
            iCont++;
            temp= temp.getSiguiente();
        }
        return iCont;
    }
     //Vaciar la lista
    public void clear(){
    inicio=null;
    fin=null;
    }
    //Obtener un nodo 
     public int getAt(int pos) throws Exception{ 
        int iTam = size();
        if (isEmpty()){
            throw new Exception("La lista está vacía");
        } else if (pos < 0 || pos >= iTam) {
            throw new Exception("La posición es inválida");
        } else{
            Nodo temp = inicio;
            int cont = 0;
            while(cont < pos){
                temp = temp.getSiguiente();
                cont++;
            }
            return temp.getValor();
        }
    }
     //Agregar Nodo al inicio
     public void addBegin(Nodo nuevo){
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setPrevio(nuevo);
            inicio = nuevo;
        }
    }
    //Insertar Nodo en posición
     public void insertAt(int pos, Nodo nuevo) throws Exception{
        int iTam = size();
        if (pos < 0 || pos >= iTam) {
            throw new Exception("La posicion es invalida");
        } else if(pos == 0){
            addBegin(nuevo);
        } else {
            int iCont = 0;
            Nodo temp = inicio;
            while(iCont < pos){
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setPrevio(temp.getPrevio());
            nuevo.setSiguiente(temp);
            temp.getPrevio().setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
    }
     //Eliminar nodo en posición
     public void deleteAt(int pos) throws Exception{
        int iTam = size();
        if (isEmpty()){
            throw new Exception("La lista esta vacia");
        } else if (pos < 0 || pos >= iTam) {
            throw new Exception("La posicion es invalida");
        } else if (iTam == 1){
            clear();
        } else { 
            if (pos == 0){
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);
            } else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                    temp = temp.getSiguiente();
                    cont++;
                }
                if (pos == (iTam - 1)) {
                    temp.getPrevio().setSiguiente(temp.getSiguiente());
                    fin = temp.getPrevio();
                } else { 
                    temp.getPrevio().setSiguiente(temp.getSiguiente());
                    temp.getSiguiente().setPrevio(temp.getPrevio());
                }
            }
        }
    }
    
}//Final de ListDoble
