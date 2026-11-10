package org.uniquindio.TercerEjercicio;



public class Camion {
    Integer peso;
    public Camion(Integer pesoMaximo){
        this.peso  = pesoMaximo;
    }
    public ColaPaquete seleccionarPaquetes(ColaPaquete Pendientes){
        ColaPaquete urgentes = this.recolectarFiltro(Pendientes,Tipo.URGENTE);
        ColaPaquete normales = this.recolectarFiltro(Pendientes,Tipo.NORMAL);
        urgentes.merge(normales);
        return urgentes;
    }

    private ColaPaquete recolectarFiltro(ColaPaquete Pendientes,Tipo tipo) {
        if (Pendientes.is_empty()) return new ColaPaquete();
        Paquete aux = Pendientes.poll();
        System.out.println("--------------");
        System.out.println("Paquete a recolectar: ");
        System.out.println(aux);
        ColaPaquete cola = new ColaPaquete();
        if (aux.getTipo().equals(tipo) && aux.getPeso() <= peso){
            System.out.println("Selecionado...");
            this.peso -= aux.getPeso();
            ColaPaquete colaAux = this.recolectarFiltro(Pendientes,tipo);
            cola.add(aux);
            cola.merge(colaAux);
        }
        else {
            System.out.println("No seleccionado...");
            cola = this.recolectarFiltro(Pendientes,tipo);
            Pendientes.add(aux);
        }
        return cola;
    }

    public void getPeso(){
        System.out.println("El peso restante del camion es: " + this.peso);
    }

}
