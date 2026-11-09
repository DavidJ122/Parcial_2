package org.uniquindio.TercerEjercicio;



public class Camion {
    public ColaPaquete seleccionarPaquetes(ColaPaquete Pendientes, Integer peso){
        ColaPaquete urgentes = this.recolectarFiltro(Pendientes,Tipo.URGENTE,peso);
        ColaPaquete normales = this.recolectarFiltro(Pendientes,Tipo.NORMAL,peso - urgentes.pesoTotal());
        urgentes.merge(normales);
        return urgentes;
    }

    private ColaPaquete recolectarFiltro(ColaPaquete Pendientes,Tipo tipo, Integer pesoMaximo) {
        if (Pendientes.is_empty()) return new ColaPaquete();
        Paquete aux = Pendientes.poll();
        ColaPaquete cola = new ColaPaquete();
        if (aux.getTipo().equals(tipo) && aux.getPeso() <= pesoMaximo){
            ColaPaquete colaAux = this.recolectarFiltro(Pendientes,tipo,pesoMaximo - aux.getPeso());
            cola.add(aux);
            cola.merge(colaAux);
        }
        else {
            cola = this.recolectarFiltro(Pendientes,tipo,pesoMaximo);
            Pendientes.add(aux);
        }
        return cola;
    }



}
