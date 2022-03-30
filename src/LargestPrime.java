public class LargestPrime {
    public static int getLargestPrime(int number) {  // largest prime factor
        if(number < 2) {
            return -1;
        }

        int largestPrime = number;
        boolean isPrime;

        for(int i = 2; i <= number / 2; i++) {  // checking any numbers greater than number/2 would be suboptimal
            if(number % i == 0) {
                isPrime = true;

                for(int j = 2; j <= (int) Math.sqrt(i); j++) {
                    if(i % j == 0) {    // therefore i is not a prime number
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }


    public static void main(String[] args) {
        System.out.println(getLargestPrime(17));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(5));
    }
}
