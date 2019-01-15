public class PandigitalMultiple {
    public static void main(String[] args) {
        System.out.println(isPan("123456788"));
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
        if(str.length()!=9){
            return false;
        }
        for(int i=1; i<=9; i++){
            String numStr = Integer.toString(i);
            if(!str.contains(numStr)){
                return false;
            }
        }
        return true;
    }
}
