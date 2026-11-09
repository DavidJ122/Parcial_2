package org.uniquindio.TercerEjercicio;

public class Paquete {
    private String codigo;
    private Tipo tipo;
    private Integer peso;
    private Paquete next;
    public Paquete(String codigo, Tipo tipo, Integer peso){
        this.codigo = codigo;
        this.tipo = tipo;
        this.peso = peso;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    public void setPeso(Integer peso){
        this.peso = peso;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public Tipo getTipo(){
        return this.tipo;
    }
    public Integer getPeso(){
        return this.peso;
    }
    public void setNext(Paquete next){
        this.next = next;
    }
    public Paquete getNext(){
        return this.next;
    }
    public void add(Paquete paquete){
        if (this.nextNotExist()){
            this.setNext(paquete);
        }
        else{
            this.getNext().add(paquete);
        }
    }
    public boolean nextNotExist(){
        return this.next == null;
    }
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        cadena.append("Codigo: ").append(this.codigo).append(" Tipo: ").append(this.tipo).append(" Peso: ").append(this.peso);
        if (this.nextNotExist()) return cadena.toString();
        cadena.append("\n");
        cadena.append(this.getNext().toString());
        return cadena.toString();
    }

    public int pesoTotal(){
        if (this.nextNotExist()) return this.peso;
        return this.peso + this.getNext().pesoTotal();
    }



}
