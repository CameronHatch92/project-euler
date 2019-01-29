import java.util.Arrays;

public class PermutatedMultiples {
    public static void main(String[] args) {
        int start = 100;
        int end = 167;
        while(!findAnswer(start, end)){
            start = start*10;
            end = end*10;
        }
    }

    public static boolean isPermutation(int num1, int num2){
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        str1 = String.join("", arr1);
        str2 = String.join("", arr2);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }

    public static boolean findAnswer(int start, int end){
        int num = start;
        while(num<end){
            int twice = 2*num;
            if(isPermutation(twice, 3*num)){
                if(isPermutation(twice, 4*num)){
                    if(isPermutation(twice, 5*num)){
                        if(isPermutation(twice, 6*num)){
                            System.out.println(num);
                            return true;
                        }
                    }
                }
            }
            num++;

        }
        return false;

    }
}
