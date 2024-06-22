/**
 *  Write a Java program to fetch prime and non prime number between the given start and end 
 *  range and store in an array seperately and print each .
 */
package Basic;
import java.util.Scanner;

public class PrimeNonPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int startRange = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int endRange = scanner.nextInt();

        // Arrays to store prime and non-prime numbers
        int[] primeNumbers = new int[endRange - startRange + 1];
        int[] nonPrimeNumbers = new int[endRange - startRange + 1];
        int primeIndex = 0;
        int nonPrimeIndex = 0;

        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                primeNumbers[primeIndex++] = i;
            } else {
                nonPrimeNumbers[nonPrimeIndex++] = i;
            }
        }

        // Printing prime numbers
        System.out.print("Prime numbers: ");
        for (int i = 0; i < primeIndex; i++) {
            System.out.print(primeNumbers[i] + " ");
        }
        System.out.println();

        // Printing non-prime numbers
        System.out.print("Non-prime numbers: ");
        for (int i = 0; i < nonPrimeIndex; i++) {
            System.out.print(nonPrimeNumbers[i] + " ");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
