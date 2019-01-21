import java.math.BigInteger;
import java.util.ArrayList;

public class SubstringDivisiblity {
    public static void main(String[] args) {
        pandigitals("0123456789", "");
        BigInteger sum = new BigInteger("0");
        for(int i=0; i<pans.size(); i++){
            if(isDivisible(pans.get(i))){
                System.out.println(pans.get(i));
                BigInteger bi = new BigInteger(pans.get(i));
                sum = sum.add(bi);
            }
        }
        System.out.println("Answer is: " + sum.toString());


    }

    public static int[] primes = {2, 3, 5, 7, 11, 13, 17};


    public static ArrayList<String> pans = new ArrayList<>();

    public static void pandigitals(String str, String newStr){
        if(str.length() == 0){
            pans.add(newStr);
            return;
        }
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++){
            String temp = "";
            for(int j=0; j<arr.length; j++){
                if(j!=i){
                    temp += arr[j];
                }
            }
            String newerStr = newStr + arr[i];
            pandigitals(temp, newerStr);
        }

    }

    public static boolean isDivisible(String str){
        for(int i=0; i<primes.length; i++){

            int num = Integer.parseInt(str.substring(i+1, i+4));
            if(num%primes[i]!= 0){
                return false;
            }
        }
        return true;
    }
}
