public class DigitFactorial {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=21; i<2000000; i++){
            if(factDigit(i)){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }

    public static int factorial(int num){
        if(num==1 || num==0){
            return 1;
        }
        int answer = 1;
        for(int i=2; i<=num; i++){
            answer *= i;
        }
        return answer;
    }

    public static boolean factDigit(int num){
        String str = Integer.toString(num);
        int sum = 0;
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++){
            sum += factorial(Integer.parseInt(arr[i]));
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
