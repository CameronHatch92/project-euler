import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CodedTriangleNumbers {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("triangle_words.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        ArrayList<String> arr = new ArrayList<>();

        while(true){
            try {
                if ((line = br.readLine()) == null) break;
                else {
                    String[] values = line.split(",");
                    for (String str : values) {
                        arr.add(str);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        int count = 0;
        for(int i=0; i<arr.size(); i++){
            if(isTriangle(arr.get(i))){
                count++;
            }
        }
        System.out.println(count);

    }

    public static ArrayList<Integer> triangleNums(){
        ArrayList<Integer> triangles = new ArrayList<>();
        int i = 1;
        int tri = i*(i+1)/2;

        while(tri<26*20){
            tri = i*(i+1)/2;
            triangles.add(tri);
            i++;
        }
        return triangles;

    }

    public static boolean isTriangle(String str){
        int sum = 0;
        for(int i=1; i<str.length()-1; i++){
            char character = str.charAt(i);
            sum += (int) character - 64;
        }
        ArrayList<Integer> triangleNumbers = triangleNums();
        return triangleNumbers.contains(sum);

    }

}
