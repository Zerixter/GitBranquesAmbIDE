public class App {

    private static final int LLISTA[] = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    private static final int NUMERO_A_MIRAR = 5;
    
    public static void main(String[] args) {
        for (int numero: LLISTA) {
            if (numero == NUMERO_A_MIRAR) {
                System.out.println("El numero es troba en el array");
                break;
            }
        }
    }
}