package org.uniquindio.SegundoEjercicio;

public class Pila_texto {
    private Palabra head = null;
    public Pila_texto(){}
    public Pila_texto(Palabra head){
        this.head = head;
    }
    private Palabra getHead(){
        return this.head;
    }
    public void push(Palabra palabra){
        Palabra aux = this.getHead();
        this.head = palabra;
        palabra.setNext(aux);
    }
    public Palabra pop(){
        Palabra aux = this.getHead();
        this.head = aux.Next();
        return aux;
    }
    public Palabra peek(){
        return this.getHead();
    }
    public boolean isEmpty(){
        return this.getHead() == null;
    }
    public String toString(){
        Pila_texto pilaTextoAux = new Pila_texto();
        StringBuilder cadena = new StringBuilder();
        while (!this.isEmpty()){
            Palabra aux = this.peek();
            pilaTextoAux.push(this.pop());
            cadena.append(aux.toString());
            if (this.peek() != null) cadena.append("->");
        }
        while (!pilaTextoAux.isEmpty()){
            this.push(pilaTextoAux.pop());
        }
        return cadena.toString();
    }
}
