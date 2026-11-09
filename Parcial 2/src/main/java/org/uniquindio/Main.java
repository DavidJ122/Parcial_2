package org.uniquindio;

import org.uniquindio.PrimerEjercicio.Caja;
import org.uniquindio.PrimerEjercicio.Deposito;
import org.uniquindio.PrimerEjercicio.Pila_valor;
import org.uniquindio.SegundoEjercicio.Palabra;
import org.uniquindio.SegundoEjercicio.Pila_texto;
import org.uniquindio.SegundoEjercicio.ProcesadorText;
import org.uniquindio.TercerEjercicio.Camion;
import org.uniquindio.TercerEjercicio.ColaPaquete;
import org.uniquindio.TercerEjercicio.Paquete;
import org.uniquindio.TercerEjercicio.Tipo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //primerEjercicio();
        //segundoEjercicio();
        tercerEjercicio();
    }
    public static void primerEjercicio(){
        Pila_valor pilaValor = new Pila_valor();
        Caja caja1 = new Caja("C1",2);
        pilaValor.push(caja1);
        Caja caja2 = new Caja("C2",4);
        pilaValor.push(caja2);
        Caja caja3 = new Caja("C3",6);
        pilaValor.push(caja3);
        Caja caja4 = new Caja("C4",8);
        pilaValor.push(caja4);
        Caja caja5 = new Caja("C5",3);
        pilaValor.push(caja5);
        Caja caja6 = new Caja("C6",9);
        pilaValor.push(caja6);
        Caja caja7 = new Caja("C7",5);
        pilaValor.push(caja7);

        Deposito deposito = new Deposito();
        System.out.println("Pila Inicial: " + pilaValor);

        if(deposito.retirarCaja(pilaValor,"C3")) {
            System.out.println("Pila despues de retirar Caja 3: " + pilaValor);
        }
        else {System.out.println("No se encontro la caja 3");}

        if (deposito.retirarCaja(pilaValor,"C4")){
        System.out.println("Pila despues de retirar Caja 4: " + pilaValor);}

        else {System.out.println("No se encontro la caja 4");}

        if (deposito.retirarCaja(pilaValor,"C7")){
            System.out.println("Pila despues de retirar Caja 7: " + pilaValor);
        }
        else {System.out.println("No se encontro la caja 7");}

        //Prueba
        if (deposito.retirarCaja(pilaValor,"C20")){
            System.out.println("Pila despues de retirar Caja 20: " + pilaValor);
        }
        else {System.out.println("No se encontro la caja 20");}
        System.out.println("Pila final:" + pilaValor);


    }
    public static void segundoEjercicio(){
        Palabra palabra = new Palabra("A1");
        Palabra palabra2 = new Palabra("A2");
        Palabra palabra3 = new Palabra("A3");
        Palabra palabra4 = new Palabra("A4");
        Palabra palabra5 = new Palabra("A5");
        Palabra palabra6 = new Palabra("A6");
        Pila_texto pila = new Pila_texto(palabra);
        pila.push(palabra2);
        pila.push(palabra3);
        pila.push(palabra4);
        pila.push(palabra5);
        pila.push(palabra6);
        System.out.println("Cadena de texto original: ");
        System.out.println(pila);
        ProcesadorText procesador = new ProcesadorText();
        Pila_texto pilaTexto = procesador.obtenerSegmento(pila,2,4);
        System.out.println("Cadena de texto seleccionada: ");
        System.out.println(pilaTexto);
        System.out.println("Cadena de texto no seleccionada: ");
        System.out.println(pila);
    }
    public static void tercerEjercicio(){
        Paquete paquete1 = new Paquete("P1", Tipo.NORMAL,4);
        Paquete paquete2 = new Paquete("P2", Tipo.URGENTE,7);
        Paquete paquete3 = new Paquete("P3", Tipo.NORMAL,3);
        Paquete paquete4 = new Paquete("P4", Tipo.URGENTE,5);
        Paquete paquete5 = new Paquete("P5", Tipo.NORMAL,6);
        Paquete paquete6 = new Paquete("P6", Tipo.URGENTE,4);
        Paquete paquete7 = new Paquete("P7", Tipo.NORMAL,2);
        ColaPaquete cola = new ColaPaquete();
        cola.add(paquete1);
        cola.add(paquete2);
        cola.add(paquete3);
        cola.add(paquete4);
        cola.add(paquete5);
        cola.add(paquete6);
        cola.add(paquete7);
        System.out.println("Paquetes pendientes originales:");
        System.out.println(cola);
        ColaPaquete Enviados = new Camion().seleccionarPaquetes(cola,14);
        System.out.println("Paquetes enviados:");
        System.out.println(Enviados);
        System.out.println("Paquetes pendientes: ");
        System.out.println(cola);

    }
}