public class CoinSums {
    public static void main(String[] args) {
        int[] coinAmounts = {1, 2, 5, 10, 20, 50, 100, 200};
        System.out.println(count(coinAmounts, 200, 0));
    }

    public static int count(int[] coins, int total, int first){
        // add one way if we get exactly zero
        if(total == 0){
            return 1;
        }
        // don't add way if total is negative
        if(total < 0){
            return 0;
        }

        int answer = 0;

        // loop through possible coin combinations and subtract them from total
        // limit coins to starting at ith index so as to avoid duplicates
        for(int i=first; i<coins.length; i++){
            int newTotal = total - coins[i];
            answer += count(coins, newTotal, i);
        }

        return answer;
    }
}
