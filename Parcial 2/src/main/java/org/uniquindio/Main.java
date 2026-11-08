package org.uniquindio;

import org.uniquindio.PrimerEjercicio.Caja;
import org.uniquindio.PrimerEjercicio.Deposito;
import org.uniquindio.PrimerEjercicio.Pila;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        primerEjercicio();
    }
    public static void primerEjercicio(){
        Pila pila = new Pila();
        Caja caja1 = new Caja("C1",2);
        pila.push(caja1);
        Caja caja2 = new Caja("C2",4);
        pila.push(caja2);
        Caja caja3 = new Caja("C3",6);
        pila.push(caja3);
        Caja caja4 = new Caja("C4",8);
        pila.push(caja4);
        Caja caja5 = new Caja("C5",3);
        pila.push(caja5);
        Caja caja6 = new Caja("C6",9);
        pila.push(caja6);
        Caja caja7 = new Caja("C7",5);
        pila.push(caja7);

        Deposito deposito = new Deposito();
        System.out.println("Pila Inicial: " + pila);

        if(deposito.retirarCaja(pila,"C3")) {
            System.out.println("Pila despues de retirar Caja 3: " + pila);
        }
        else {System.out.println("No se encontro la caja 3");}

        if (deposito.retirarCaja(pila,"C4")){
        System.out.println("Pila despues de retirar Caja 4: " + pila);}

        else {System.out.println("No se encontro la caja 4");}

        if (deposito.retirarCaja(pila,"C7")){
            System.out.println("Pila despues de retirar Caja 7: " + pila);
        }
        else {System.out.println("No se encontro la caja 7");}

        //Prueba
        if (deposito.retirarCaja(pila,"C20")){
            System.out.println("Pila despues de retirar Caja 20: " + pila);
        }
        else {System.out.println("No se encontro la caja 20");}
        System.out.println("Pila final:" + pila );


    }
}