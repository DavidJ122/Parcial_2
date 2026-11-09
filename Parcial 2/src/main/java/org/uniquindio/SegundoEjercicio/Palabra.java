package org.uniquindio.SegundoEjercicio;

public class Palabra {
    private String palabra;
    private Palabra next;

    public Palabra(){}
    public Palabra(String palabra){
        this.palabra = palabra;
    }

    public boolean nextExist(){
        return this.next != null;
    }
    public void setNext(Palabra next){
        this.next = next;
    }
    public Palabra Next(){
        return this.next;
    }
    public void setPalabra(String codigo){
        this.palabra = codigo;
    }
    public String getPalabra(){
        return this.palabra;
    }
    public String toString(){
        return this.palabra;
    }


}
