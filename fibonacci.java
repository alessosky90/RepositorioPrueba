import java.util.Scanner;

public class fibonacci {
    
    // Método recursivo 
    public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;          // Caso base 1
        } else if (n == 1) {
            return 1;          // Caso base 2
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2); // Llamada recursiva
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos: ");
        int n = sc.nextInt();
        
        System.out.print("Serie Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
        System.out.println();
    }
}