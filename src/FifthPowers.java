public class FifthPowers {
    public static void main(String[] args) {
        int sum = 0;
        for(int j=10; j<300000; j++){
            if(fifth(j)){
                sum += j;
            }
        }
        System.out.println(sum);
    }

    public static boolean fifth(int num){
        int sum = 0;
        int copy = num;
        while (copy > 0){
            sum += Math.pow(copy%10, 5);
            copy = (int) Math.floor(copy/10);
        }
        if (sum == num){
            return true;
        }
        return false;
    }
}
