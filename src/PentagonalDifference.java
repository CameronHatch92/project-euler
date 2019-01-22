import java.util.ArrayList;

public class PentagonalDifference {
    public static void main(String[] args) {
        for(int i=1; i<10000; i++){
            pentNums.add(pentagon(i));
        }

//        pentNums.add(1);
//        pentNums.add(2);
//        pentNums.add(3);
//        pentNums.add(5);
//        pentNums.add(8);
//        pentNums.add(14);
        System.out.println(pentNums.size());
        System.out.println(pentDiff());

    }
    public static int pentagon(int num){
        return num*(3*num-1)/2;
    }

    public static ArrayList<Integer> pentNums = new ArrayList<>();


//    public static int pentDiff(){
//        int answer = 0;
//        for(int i=0; i<pentNums.size(); i++){
//            int target = pentNums.get(i);
//            int j=i;
//            while((j+1<pentNums.size())&&(pentNums.get(j+1)-pentNums.get(j)<=target)){
//                for(int k=i; k<j; k++){
//                    int diff = pentNums.get(j) - pentNums.get(k);
//                    if(diff == target){
//                        int sum = pentNums.get(j) + pentNums.get(k);
//                        if(pentNums.contains(sum)){
//                            answer = diff;
//                            System.out.println("j: " + j + ", K: " + k);
//                            return answer;
//                        }
//                    }
//                }
//                j++;
//            }
//        }
//        return 0;
//    }

    public static int pentDiff(){
        for(int i=1; i<pentNums.size(); i++){
            for(int j=0; j<i; j++){
                int diff = pentNums.get(i) - pentNums.get(j);
                if(pentNums.contains(diff)){
                    int sum = pentNums.get(i) + pentNums.get(j);
                    if(pentNums.contains(sum)){
                        System.out.println("I: " + i + ", j: " + j);
                        return diff;
                    }
                }
            }
        }
        return 0;
    }

}
