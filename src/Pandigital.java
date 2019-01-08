import java.util.HashMap;

public class Pandigital {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        permuatation("123456789", "");

        for(String key: perms.keySet()){
            int product = Integer.parseInt(key.substring(0,4));
            int firstProd = Integer.parseInt(key.substring(4,5))*Integer.parseInt(key.substring(5,9));
            if(product == firstProd){
                hmap.put(product, "a");
                continue;
            }
            int secondProd = Integer.parseInt(key.substring(4,6))*Integer.parseInt(key.substring(6,9));
            if(product == secondProd){
                hmap.put(product, "a");
                continue;
            }
            int thirdProd = Integer.parseInt(key.substring(4,7))*Integer.parseInt(key.substring(7,9));
            if(product == thirdProd){
                hmap.put(product, "a");
                continue;
            }
            int fourthProd = Integer.parseInt(key.substring(4,8))*Integer.parseInt(key.substring(8,9));
            if(product == fourthProd){
                hmap.put(product, "a");
                continue;
            }
        }

        int sum = 0;
        for(int key: hmap.keySet()){
            sum += key;
        }
        System.out.println(sum);


    }

    public static HashMap<String, String> perms = new HashMap<>();

    public static void permuatation(String string, String newString){
        String[] arr = string.split("");
        if(string.length()==0){
            perms.put(newString, "x");
            return;
        }
        for(int i=0; i<arr.length; i++){
            String newerString = newString + arr[i];
            String tmpStr = "";
            for(int j=0; j<arr.length; j++){
                if(j!=i){
                    tmpStr += arr[j];
                }
            }
            permuatation(tmpStr, newerString);

        }

        return;
    }
}
