public class PandigitalMultiple {
    public static void main(String[] args) {
        int largest = 918273645;
        for(int i=92; i<=9876; i++){
            if(firstNine(i)){
                String str = givesDigits(i);
                if(str.length()==9){
                    int current = Integer.parseInt(str);
                    System.out.println(current);
                    if(isPan(str)){
                        if(current>largest){
                            largest = current;
                        }
                    }
                }

            }
        }
        System.out.println(largest);
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
        for(int i=1; i<=9; i++){
            String numStr = Integer.toString(i);
            if(!str.contains(numStr)){
                return false;
            }
        }
        return true;
    }

    public static boolean firstNine(int num){
        String str = Integer.toString(num);
        if(str.substring(0,1).equals("9")){
            return true;
        }
        return false;
    }
}
