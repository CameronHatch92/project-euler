import java.util.ArrayList;
import java.util.HashMap;

public class PrimeDigitReplacements {
    public static void main(String[] args) {

        System.out.println(findAnswer());
    }

    public static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static HashMap<String, ArrayList<Integer>> getDigits(int num){
        String str = Integer.toString(num);
        HashMap<String, ArrayList<Integer>> hmap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            String digit = str.substring(i, i+1);
            if(hmap.containsKey(digit)){
                ArrayList<Integer> arr = hmap.get(digit);
                arr.add(i);
            }
            else {
                if(digit.equals("0") || digit.equals("1") || digit.equals("2")){
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(i);
                    hmap.put(digit, arr);
                }

            }
        }
        return hmap;
    }

    public static int getPrimeCount(int num, ArrayList<Integer> arr){
        String[] strArr = Integer.toString(num).split("");
        int primeCount = 0;
        int start = 0;

        if(arr.contains(0)){
            start = 1;
        }
        for(int i=start; i<=9; i++){
            String intStr = Integer.toString(i);
            for(int j=0; j<arr.size(); j++){
                strArr[arr.get(j)] = intStr;

            }
            if(isPrime(Integer.parseInt(String.join("", strArr)))){
                primeCount++;
                if((primeCount+10-i)<8){
                    return primeCount;
                }
            }
        }
        return primeCount;
    }

    public static int getTotalPrimeCount(int num, ArrayList<Integer> arr){
        if(arr.size()==3){
            return getPrimeCount(num, arr);
        }
        ArrayList<Integer> primeCounts = new ArrayList<>();
        int primeCount = 0;
        if(arr.size()==4){
            ArrayList<Integer> arr0 = new ArrayList<>();
            arr0.add(arr.get(1));
            arr0.add(arr.get(2));
            arr0.add(arr.get(3));
            ArrayList<Integer> arr1 = new ArrayList<>();
            arr1.add(arr.get(0));
            arr1.add(arr.get(2));
            arr1.add(arr.get(3));
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.add(arr.get(1));
            arr2.add(arr.get(0));
            arr2.add(arr.get(3));
            ArrayList<Integer> arr3 = new ArrayList<>();
            arr3.add(arr.get(1));
            arr3.add(arr.get(2));
            arr3.add(arr.get(0));
            int count1 = getPrimeCount(num, arr0);
            if(count1>primeCount){
                primeCount = count1;
            }
            int count2 = getPrimeCount(num, arr1);
            if(count2>primeCount){
                primeCount = count2;
            }
            int count3 = getPrimeCount(num, arr2);
            if(count3>primeCount){
                primeCount = count3;
            }
            int count4 = getPrimeCount(num, arr3);
            if(count4>primeCount){
                primeCount = count4;
            }
        }
        return primeCount;

    }

    public static int findAnswer(){
       int prime = 10001;
       while(prime<1000000){
           if(isPrime(prime)){
               int primeCount = 0;
               HashMap<String, ArrayList<Integer>> hmap = getDigits(prime);
               if(hmap.containsKey("0")){
                   int count0 = getTotalPrimeCount(prime, hmap.get("0"));
                   if(count0>=8){
                       return prime;
                   }
               }
               if(hmap.containsKey("1")){
                   int count0 = getTotalPrimeCount(prime, hmap.get("1"));
                   if(count0>=8){
                       return prime;
                   }
               }
               if(hmap.containsKey("2")){
                   int count0 = getTotalPrimeCount(prime, hmap.get("2"));
                   if(count0>=8){
                       return prime;
                   }
               }

           }

           prime += 2;
       }
       return 0;
    }


}
