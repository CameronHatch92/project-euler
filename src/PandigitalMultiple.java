public class PandigitalMultiple {
    public static void main(String[] args) {
        System.out.println(givesDigits(9));
    }

    public static String givesDigits(int num){
        String str = Integer.toString(num);
        int i=2;
        while(str.length()<9){
            str+=Integer.toString(num*i);
            i++;
        }
        return str;
    }

    public static boolean isPan(String str){
        
    }
}
