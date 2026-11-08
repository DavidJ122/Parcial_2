package org.uniquindio.PrimerEjercicio;

public class Pila {
    private Caja head = null;

    public Pila(Caja head){
        this.setHead(head);
    }
    public Pila(){}

    private void setHead(Caja head){
        this.head = head;
    }

    private Caja getHead(){
        return this.head;
    }

    public void push(Caja caja){
        Caja aux = this.getHead();
        this.setHead(caja);
        caja.setNext(aux);
    }
    public Caja pop(){
        Caja aux = this.getHead();
        this.setHead(aux.Next());
        aux.setNext(null);
        return aux;
    }

    public boolean isEmpty(){
        return this.getHead() == null;
    }

    public Caja peek(){
        return this.getHead();
    }
    public String toString(){
        Pila pilaAux = new Pila();
        StringBuilder cadena = new StringBuilder();
        cadena.append("\n");
        int index = 1;
        while (!this.isEmpty()){
            cadena.append("{").append(index).append("}").append("-");
            cadena.append(this.peek().toString());
            cadena.append("\n");
            pilaAux.push(this.pop());
            index++;
        }
        while (!pilaAux.isEmpty()){
            this.push(pilaAux.pop());
        }
        return cadena.toString();
    }

}
