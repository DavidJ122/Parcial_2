package org.uniquindio.SegundoEjercicio;

public class ProcesadorText {
    public Pila_texto obtenerSegmento(Pila_texto pilaTexto, int inicio, int fin){
        Pila_texto pilaTextoIncluidos = new Pila_texto();
        Pila_texto pilaTextoExcluidos = new Pila_texto();
        Pila_texto pilaNueva = new Pila_texto();
        int index = 1;
        System.out.println("Segmento seleccionado: " + inicio + " - " + fin);
        while (!pilaTexto.isEmpty()){
            Palabra aux = pilaTexto.pop();
            System.out.println("{"+index+"}-Palabra: " + aux);
            if (index >= inicio && index <= fin){
                System.out.println("Seleccionada.");
                pilaTextoIncluidos.push(aux);
            }
            else{
                System.out.println("No seleccionada.");
                pilaTextoExcluidos.push(aux);
            }
            index++;
        }
        if (pilaTextoIncluidos.isEmpty()) return pilaNueva;
        if (index < fin){
            while (true){
                if (pilaTextoIncluidos.isEmpty() && pilaTextoExcluidos.isEmpty()) break;
                if (index >= inicio){
                    pilaTexto.push(pilaTextoIncluidos.pop());
                }
                else{
                    pilaTexto.push(pilaTextoExcluidos.pop());
                }
                index--;
            }
            return pilaNueva;
        }
        while (!pilaTextoIncluidos.isEmpty()){
            pilaNueva.push(pilaTextoIncluidos.pop());
        }
        while (!pilaTextoExcluidos.isEmpty()){
            pilaTexto.push(pilaTextoExcluidos.pop());
        }
        return pilaNueva;
    }
}
