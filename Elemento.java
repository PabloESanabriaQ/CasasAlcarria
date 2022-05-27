public class Elemento {
    CasaRural casaRural;
    Elemento siguiente;

    Elemento(CasaRural casaRural, Elemento elemento){
        this.casaRural = casaRural;
        this.siguiente = elemento;
    }
}