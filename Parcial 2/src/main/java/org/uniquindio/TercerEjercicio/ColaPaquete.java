package org.uniquindio.TercerEjercicio;

public class ColaPaquete {
    private Paquete head = null;
    public ColaPaquete(){}
    public ColaPaquete(Paquete head){
        this.head = head;
    }

    public Paquete poll(){
        if (this.is_empty()) return null;
        Paquete aux = this.head;
        this.sethead(aux.getNext());
        aux.setNext(null);
        return aux;
    }

    public boolean is_empty(){
        return this.head == null;
    }
    private void sethead(Paquete head){
        this.head = head;
    }

    public void add(Paquete paquete){
        if (this.is_empty()) this.sethead(paquete);
        else {
            this.getHead().add(paquete);
        }
    }

    private Paquete getHead(){
        return this.head;
    }
    public boolean merge(ColaPaquete cola){
        if (cola.is_empty()) return true;
        Paquete aux = cola.poll();
        this.add(aux);
        return this.merge(cola);
    }

    public String toString(){
        if (this.is_empty()) return "Cola vacia";
        return this.getHead().toString();
    }
    public int pesoTotal(){
        if (this.is_empty()) return 0;
        return this.getHead().pesoTotal();
    }


}
