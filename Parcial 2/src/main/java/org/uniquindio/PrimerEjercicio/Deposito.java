package org.uniquindio.PrimerEjercicio;

public class Deposito {
    public boolean retirarCaja(Pila pila,String codigo){
        if (pila.isEmpty()) return false;
        Caja caja_encontrada = null;
        Pila pilaAux = new Pila();
        while (!pila.isEmpty()){
            Caja aux = pila.pop();
            if (aux.is_codigo(codigo)){
                caja_encontrada = aux;
            }
            else{pilaAux.push(aux);}
        }
        while (!pilaAux.isEmpty()){
            pila.push(pilaAux.pop());
        }
        if (caja_encontrada == null) return false;
        System.out.println("Caja retirada: " + caja_encontrada);
        System.out.println("Pila sin barajear: " + pila);
        if (caja_encontrada.is_par()){ this.organizarPar(pila);}
        else {  this.organizarImpar(pila);}
        return true;

    }
    private void organizarPar(Pila pila){
        System.out.println("El valor es par. Barajeando... ");
        Pila pilaPar = new Pila();
        Pila pilaImpar = new Pila();
        int index = 1;
        while (!pila.isEmpty()){
            Caja aux = pila.pop();
            if (this.esPar(index)){
                pilaPar.push(aux);

            }
            else{
                pilaImpar.push(aux);
            }
            index++;
        }
        index = 1;
        while (!pilaPar.isEmpty()){
            pila.push(pilaPar.pop());
            index++;
        }
        while (!pilaImpar.isEmpty()){
            pila.push(pilaImpar.pop());
            index++;
        }

    }

    private void organizarImpar(Pila pila){
        System.out.println("El valor es impar. Barajeando...");
        Pila pilaPar = new Pila();
        Pila pilaImpar = new Pila();
        int index = 1;
        while (!pila.isEmpty()){
            Caja aux = pila.pop();
            if (this.esPar(index)){
                pilaPar.push(aux);

            }
            else{
                pilaImpar.push(aux);
            }
            index++;
        }
        index = 1;
        while (!pilaImpar.isEmpty()){
            pila.push(pilaImpar.pop());
            index++;
        }
        while (!pilaPar.isEmpty()){
            pila.push(pilaPar.pop());
            index++;
        }

    }
    private boolean esPar(int valor){
        return valor % 2 == 0;
    }


}
