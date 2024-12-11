//java prg to calculate prime numbers
public class primeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.println(:prime numbers from 1 to 100 are :");
                System.out.print(number + " ");
            }
        }
    }
    //function to calculate the prime or not 
    public static boolean isPrime(int num) {
        if (num < 2) {
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
