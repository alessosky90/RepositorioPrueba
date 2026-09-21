import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Serie Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }
}
