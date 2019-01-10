public class DoubleBasePalindrome {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<1000000; i++){
            if(isPalin(Integer.toString(i))){
                if(isPalin(Integer.toBinaryString(i))){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean isPalin(String str){
        if(str.length()==1){
            return true;
        }
        StringBuilder reverse = new StringBuilder("");
        for(int i=str.length()-1; i>=0; i--){
            if(!str.substring(i, i+1).equals("0") || reverse.length()!=0){
                reverse.append(str.substring(i, i+1));
            }

        }
        if(reverse.toString().equals(str)){
            return true;
        }
        return false;
    }
}
