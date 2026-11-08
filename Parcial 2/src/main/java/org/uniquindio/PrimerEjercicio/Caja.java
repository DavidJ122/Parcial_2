package org.uniquindio.PrimerEjercicio;

public class Caja {
    private String codigo;
    private Integer valor;
    private Caja next;

    public Caja(){}
    public Caja(String codigo, Integer valor){
        this.codigo = codigo;
        this.valor = valor;
    }
    public boolean is_codigo(String codigo){
        return this.codigo.equals(codigo);
    }
    public boolean nextExist(){
        return this.next != null;
    }
    public void setNext(Caja next){
        this.next = next;
    }
    public Caja Next(){
        return this.next;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setValor(Integer valor){
        this.valor = valor;
    }
    public boolean is_par(){
        return this.valor % 2 == 0;
    }
    public String toString(){;
        return "[Codigo: " + this.codigo + " Valor: " + this.valor+"]";
    }


}
