public class TrancatablePrimes {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int i = 23;
        while(count<11){
            if(isPrime(i)){
                if(rightTrunc(i)){
                    if(leftTrunc(i)){
                        count++;
                        sum += i;
                        System.out.println(i);
                    }
                }
            }
            i+=2;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int num){
        if(num==1 || num==0){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean rightTrunc(int num){
        String str = Integer.toString(num);
        while(str.length()>=2){
            str = str.substring(0, str.length()-1);
            if(!isPrime(Integer.parseInt(str))){
                return false;
            }
        }
        return true;
    }

    public static boolean leftTrunc(int num){
        String str = Integer.toString(num);
        while(str.length()>=2){
            str = str.substring(1, str.length());
            if(!isPrime(Integer.parseInt(str))){
                return false;
            }
        }
        return true;
    }
}
