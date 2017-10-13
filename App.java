import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static final int LONGITURA_LLISTA = 700000;
    private static final Random RANDOM = new Random();
    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<>();
        for (int i = 0;i < LONGITURA_LLISTA;i++) {
            llista.add(RANDOM.nextInt(1000000));
        }
        do {
            System.out.println("Quin numero vols revisar que estigui en el array?");
        }while (!IN.hasNextInt());
        int numero_a_mirar = IN.nextInt();
        long before = System.nanoTime();
        if (llista.contains(numero_a_mirar)) {
            System.out.println("El numero "+numero_a_mirar+" està en el array");
        }else {
            System.out.println("El numero "+numero_a_mirar+" no està en el array");
        }
        System.out.println("Han passat "+(System.nanoTime() - before)+" nanosegons");
    }
}
