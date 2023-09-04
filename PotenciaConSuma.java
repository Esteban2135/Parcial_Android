public class PotenciaConSuma {
    public static void main(String[] args) {
        int base = 3;
        int exponente = 5;
        int resultado = potenciaConSuma(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }

    public static int potenciaConSuma(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo");
        } else {
            return base * potenciaConSuma(base, exponente - 1);
        }
    }
}
