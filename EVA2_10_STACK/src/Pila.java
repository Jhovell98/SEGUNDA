
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pila {
   private Nodo inicio;
   private Nodo fin;
    public Pila(){
    this.inicio=null;
    this.fin=null;
    }
    //Devuelve "true" si la lista está vacia 
    public boolean isEmpty(){
    if(inicio==null){
    return true;
    }else 
        return false;
    }
    //Agrear un Nodo al final de la lista 
    public void add(Nodo nuevo ){
        //Verificar si la lista está vacia
        if(isEmpty()) {
            inicio = nuevo;
            fin=nuevo;
        }else{
            /*Nodo temp;
            temp = inicio;
            fin = nuevo;
            while(temp.getSiguiente()!=null){
            temp= temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void addBegin(Nodo nuevo){
    if(isEmpty()) {
        inicio = nuevo;
        fin=nuevo;
        }else{
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
          }
    }
    //Imprimir Lista
    public void print(){
    Nodo temp= inicio;
        while (temp!=null) {            
            System.out.print(temp.getValor() + "-");
            temp= temp.getSiguiente();
        }
        System.out.println("");
        }
    //Insertar en posiciòn
    public void insertArt(int pos, Nodo nuevo) throws Exception{
    int iTama = size();
    if((pos<0||(pos>=iTama))){
        throw new Exception("La posiciòn es invàlida");
        
    }else{
        if(pos==0){
        addBegin(nuevo);
    }
    else{
    int iCont=0;
    Nodo temp=inicio;
    while(iCont<pos){
        temp= temp.getSiguiente();
        iCont++;
    }
    nuevo.setSiguiente(temp.getSiguiente());
    temp.setSiguiente(nuevo);
        }
       }
    }
    //Cantidad de elemenmtos en la lista 
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
    //Borar un nodo 
    public void deleteAt(int pos) throws Exception{
        //Verificar lista vacia
        if (isEmpty()) {
                throw new Exception("La lista está vacía");
        }
        int iTama=size();
        if((pos<0||(pos>=iTama))){
        throw new Exception("La posiciòn es invàlida");
            }
        if(iTama==1){//Solo hay un nodo
        clear();
        }else{//Muchos nodos
            if(pos==0){//Borra el primer nodo 
            inicio=inicio.getSiguiente();
            }else{
                int iCont=0;
                Nodo temp= inicio;
                while(iCont <(pos-1)){
                temp=temp.getSiguiente();
                iCont++;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(pos==(iTama-1))
                    fin=temp;
            }
            
        }
        
    }
    public int getAt(int pos){
    //verificaciones 
        if (isEmpty()) {
            System.out.println("La lista está vacia ");
        }
     int iCont=0;
     Nodo temp= inicio;
     while(iCont <(pos)){
     temp=temp.getSiguiente();
     iCont++;
         }
     return temp.getValor();
    }
    //Agregar un nodo a la cima de la pila
    public void push(Nodo nuevo){
        addBegin(nuevo);
    }
    //Lee el nodo en la cima de la pila
    public int peek(){
        return getAt(0);
    }
    //Lee y quita el Nodo de la cima
    public int pop() throws Exception{
    int iResu = getAt(0);
        deleteAt(0);
    return iResu;
    }
}

