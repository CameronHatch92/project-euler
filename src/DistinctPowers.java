import java.math.BigInteger;
import java.util.HashMap;

public class DistinctPowers {
    public static void main(String[] args) {
        HashMap<BigInteger, String> hmap = new HashMap<BigInteger, String>();

        for(int i=2; i<=100; i++){
            for(int j=2; j<=100; j++){
                String str = "" + i;
                BigInteger base = new BigInteger(str);
                BigInteger num = base.pow(j);
                if(!hmap.containsKey(num)){
                    hmap.put(num, "a");
                }
            }
        }
        System.out.println(hmap.size());
    }
}
