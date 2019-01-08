public class DigitCancellation {
    public static void main(String[] args) {
        System.out.println(denoms());
    }

    public static int denoms(){
        int den = 1;
        int num = 1;
        for(int i=11; i<100; i++){
            for(int j=10; j<i; j++){
                if(match(j, i)){
                    System.out.println("(" + j + ", " + i + ")");
                    den = den * i;
                    num = num * j;
                }
            }
        }
        System.out.println(num + " / " + den);
        return den;
    }

    public static boolean match(int num1, int num2){
        double actual = num1/(double) num2;
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        double fake;

        if(num1%10==0||num2%10==0){
            return false;
        }
        String[] arr1 = str1.split("");
        if(!str2.contains(arr1[0])&&!str2.contains(arr1[1])){
            return false;
        } else if(str2.contains(arr1[0])){
            int index = str2.indexOf(arr1[0]);
            if(index==0){
                fake = Integer.parseInt(arr1[1]) / (double) Integer.parseInt(str2.substring(1,2));
            }else{
                fake = Integer.parseInt(arr1[1]) / (double) Integer.parseInt(str2.substring(0,1));
            }
        } else {
            int index = str2.indexOf(arr1[1]);
            if(index==0){
                fake = Integer.parseInt(arr1[0]) / (double) Integer.parseInt(str2.substring(1,2));
            }else{
                fake = Integer.parseInt(arr1[0]) / (double) Integer.parseInt(str2.substring(0,1));
            }
        }
        if(fake == actual){
            return true;
        }
        return false;

    }
}
