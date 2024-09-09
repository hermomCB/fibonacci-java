import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int number) {
        
        int a = 0;
        int b = 1;
        
        while (a < number) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        return a == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
