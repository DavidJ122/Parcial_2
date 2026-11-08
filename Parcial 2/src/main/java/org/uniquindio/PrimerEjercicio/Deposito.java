package org.uniquindio.PrimerEjercicio;

public class Deposito {
    public boolean retirarCaja(Pila_valor pilaValor, String codigo){
        if (pilaValor.isEmpty()) return false;
        Caja caja_encontrada = null;
        Pila_valor pilaValorAux = new Pila_valor();
        while (!pilaValor.isEmpty()){
            Caja aux = pilaValor.pop();
            if (aux.is_codigo(codigo)){
                caja_encontrada = aux;
            }
            else{
                pilaValorAux.push(aux);}
        }
        while (!pilaValorAux.isEmpty()){
            pilaValor.push(pilaValorAux.pop());
        }
        if (caja_encontrada == null) return false;
        System.out.println("Caja retirada: " + caja_encontrada);
        System.out.println("Pila sin barajear: " + pilaValor);
        if (caja_encontrada.is_par()){ this.organizarPar(pilaValor);}
        else {  this.organizarImpar(pilaValor);}
        return true;

    }
    private void organizarPar(Pila_valor pilaValor){
        System.out.println("El valor es par. Barajeando... ");
        Pila_valor pilaValorPar = new Pila_valor();
        Pila_valor pilaValorImpar = new Pila_valor();
        int index = 1;
        while (!pilaValor.isEmpty()){
            Caja aux = pilaValor.pop();
            if (this.esPar(index)){
                pilaValorPar.push(aux);

            }
            else{
                pilaValorImpar.push(aux);
            }
            index++;
        }
        index = 1;
        while (!pilaValorPar.isEmpty()){
            pilaValor.push(pilaValorPar.pop());
            index++;
        }
        while (!pilaValorImpar.isEmpty()){
            pilaValor.push(pilaValorImpar.pop());
            index++;
        }

    }

    private void organizarImpar(Pila_valor pilaValor){
        System.out.println("El valor es impar. Barajeando...");
        Pila_valor pilaValorPar = new Pila_valor();
        Pila_valor pilaValorImpar = new Pila_valor();
        int index = 1;
        while (!pilaValor.isEmpty()){
            Caja aux = pilaValor.pop();
            if (this.esPar(index)){
                pilaValorPar.push(aux);

            }
            else{
                pilaValorImpar.push(aux);
            }
            index++;
        }
        index = 1;
        while (!pilaValorImpar.isEmpty()){
            pilaValor.push(pilaValorImpar.pop());
            index++;
        }
        while (!pilaValorPar.isEmpty()){
            pilaValor.push(pilaValorPar.pop());
            index++;
        }

    }
    private boolean esPar(int valor){
        return valor % 2 == 0;
    }


}
