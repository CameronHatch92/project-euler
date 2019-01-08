public class QuadraticPrimes {
    public static void main(String[] args) {
        int a = answer();
        System.out.println(a);

    }

    public static boolean isPrime(int num) {
        int i;
        for(i=2; i < num/2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] primes() {
        int[] answer = new int[170];
        int index = 0;
        int i;
        for(i=2; i<1000; i++){
            if(isPrime(i)){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }

    public static int quadratic(int num1, int num2, int num){
        return num*num + num1*num + num2;
    }

    public static int numberOfPrimes(int num1, int num2){
        int n = 0;
        while(isPrime(Math.abs(quadratic(num1, num2, n)))){
            n++;
        }
        return n;
    }

    public static int answer(){
        int[] arr = primes();
        int i;
        int j;
        int numPrimes = 0;
        int product = 0;
        for (i = -1000; i<=1000; i++){
            for( j=0; j<arr.length; j++){
                int currentPrimes = numberOfPrimes(i, arr[j]);
                if(currentPrimes > numPrimes){
                    numPrimes = currentPrimes;
                    product = i*arr[j];
                }
                currentPrimes = numberOfPrimes(i, -arr[j]);
                if(currentPrimes > numPrimes){
                    numPrimes = currentPrimes;
                    product = i*-arr[j];
                }

            }
        }
        return product;
    }
}
