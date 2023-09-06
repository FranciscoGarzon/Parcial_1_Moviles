
public class PotenciaRecursiva {
    
    public static int potencia(int a, int b){
        if (b == 0) {
            return 1;
        } else if (b > 0) {
            return multiplica(a, potencia(a, b - 1));
        } else {
            return -potencia(a, -b);
        }
    }

    public static int multiplica(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiplica(a, b - 1);
        } else {
            return -multiplica(a, -b);
        }
    }

    public static void main(String[] args) {
        int base = 4;
        int exponente = 4;
        int resultado = potencia(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}
