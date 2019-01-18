import java.util.ArrayList;

public class PandigitalPrimes {
    public static void main(String[] args) {
        String[] pandigitalArr = new String[6];
        for(int i=4; i<=9; i++){
            StringBuilder str = new StringBuilder();
            for(int j=1; j<=i; j++){
                str.append(j);
            }
            pandigitalArr[i-4] = str.toString();
        }
        int index = pandigitalArr.length-1;
      while(primes.size()==0){
        anagrams(pandigitalArr[index], "");
        index--;
      }
      int max = 0;
      for(int i=0; i<primes.size(); i++){
          int current = primes.get(i);
          if(current>max){
              max = current;
          }
      }
        System.out.println("Max is " + max);
    }

    public static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primes = new ArrayList<>();

    public static void anagrams(String str, String newStr){
        if(str.length()==0){
            int num = Integer.parseInt(newStr);
            if(isPrime(num)){
                primes.add(num);
            }
            return;
        }

        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++){
            String newerString = newStr + arr[i];
            String tempStr = "";
            for(int j=0; j<arr.length; j++){
                if(j!=i){
                    tempStr+=arr[j];
                }
            }
            anagrams(tempStr, newerString);
        }
    }
}
