package logica;

public class Parcial {

    public int potencia(int b,int e) {
        if (e < 0) {
            throw new IllegalArgumentException("e no puede ser negativo");
        }

        int rfinal=1;
        for (int i=0; i<e; i++) {
            
            if (rfinal > Integer.MAX_VALUE / b) {
                throw new ArithmeticException("el resultado es demasiado grande para un numero entero");
            }
            rfinal*=b;
        }

        return rfinal;
    }
}

