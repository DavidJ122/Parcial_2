package org.uniquindio.CuartoEjercicio;

public class Laboratorio {

    public int contarEquiposEnRango(Nodo raiz, int limiteInferior, int limiteSuperior) {
        if (raiz == null || limiteInferior > limiteSuperior) {
            return 0;
        }

        if (raiz.getCodigo() < limiteInferior) {
            return contarEquiposEnRango(raiz.getDer(), limiteInferior, limiteSuperior);
        }

        if (raiz.getCodigo() > limiteSuperior) {
            return contarEquiposEnRango(raiz.getIzq(), limiteInferior, limiteSuperior);
        }

        return 1 + contarEquiposEnRango(raiz.getIzq(), limiteInferior, limiteSuperior)
                 + contarEquiposEnRango(raiz.getDer(), limiteInferior, limiteSuperior);
    }
}