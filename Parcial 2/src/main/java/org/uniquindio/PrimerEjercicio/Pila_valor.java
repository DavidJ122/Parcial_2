package org.uniquindio.PrimerEjercicio;

public class Pila_valor {
    private Caja head = null;

    public Pila_valor(Caja head){
        this.setHead(head);
    }
    public Pila_valor(){}

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
        Pila_valor pilaValorAux = new Pila_valor();
        StringBuilder cadena = new StringBuilder();
        cadena.append("\n");
        int index = 1;
        while (!this.isEmpty()){
            cadena.append("{").append(index).append("}").append("-");
            cadena.append(this.peek().toString());
            cadena.append("\n");
            pilaValorAux.push(this.pop());
            index++;
        }
        while (!pilaValorAux.isEmpty()){
            this.push(pilaValorAux.pop());
        }
        return cadena.toString();
    }

}
