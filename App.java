import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static final int LONGITURA_LLISTA = 1000000;
    private static final Random RANDOM = new Random();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<>();

        for (int i = 0;i < LONGITURA_LLISTA;i++) {
            llista.add(RANDOM.nextInt(1000000));
        }
        
        do {
            System.out.println("Quin numero vols revisar que estigui en el array?");
        }while (!in.hasNextInt());
        int numero_a_mirar = in.nextInt();

        long temps_abans_de_for = System.nanoTime();

        boolean esta_en_el_array = false;
        for (int numero: llista) {
            if (numero == numero_a_mirar) {
                esta_en_el_array = true;
                break;
            }
        }
        long temps_despres_de_for = System.nanoTime();
        long nano_segons_passats = temps_despres_de_for - temps_abans_de_for;

        if (esta_en_el_array) {
            System.out.println("El numero "+numero_a_mirar+" està en el array");
        } else {
            System.out.println("El numero "+numero_a_mirar+" no està en el array");
        }

        System.out.println("Han passat "+nano_segons_passats+" nanosegons");
    }
}