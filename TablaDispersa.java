public class TablaDispersa {
    static final int TAMTABLA = 101;
    private int numElementos;
    private double factorCarga;
    private CasaRural[] tabla;

    public TablaDispersa() {
        tabla = new CasaRural[TAMTABLA];
        for (int i = 0; i < TAMTABLA; i++) {
            tabla[i] = null;
            numElementos = 0;
            factorCarga = 0.0;
        }
    }
/*
    public int direccion(String clave) {
        int i = 0, p;
        long d;
        d = transformaCadena(clave);
        // aplica aritmética modular para obtener dirección base
        p = (int) (d % TAMTABLA);
        // bucle de exploración
        while (tabla[p] != null && !tabla[p].getCodigo().equals(clave)) {
            i++;
            p = p + i * i;
            p = p % TAMTABLA; // considera el array como circular
        }
        return p;
    }

    long transformaCadena(String c) {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(10, c.length()); j++) {
            d = d * 27 + (int) c.charAt(j);
        }
        if (d < 0)
            d = -d;
        return d;
    }
    */
}
