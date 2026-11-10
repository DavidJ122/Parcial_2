package org.uniquindio.CuartoEjercicio;

public class Nodo {
    private int codigo;
    private Nodo izq;
    private Nodo der;

    public Nodo(int codigo) {
        this.codigo = codigo;
        this.izq = null;
        this.der = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
}