public class CircularPrimes {
    public static void main(String[] args) {
        int count = 1;
        for(int i=3; i<1000000; i+=2){
            if(circularPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int circular(int num){
        String str = Integer.toString(num);
        if(str.length()<2){
            return num;
        }
        String newStr = str.substring(1, str.length()) + str.substring(0,1);
        return Integer.parseInt(newStr);
    }

    public static boolean circularPrime(int num){
        String str = Integer.toString(num);
        if(str.contains("2")|| str.contains("4")||str.contains("6")||str.contains("8")||str.contains("0")){
            return false;
        }
        if(!isPrime(num)){
            return false;
        }
        int shifted = circular(num);
        while(shifted!=num){
            if(!isPrime(shifted)){
                return false;
            }
            shifted = circular(shifted);
        }
        return true;
    }
}
