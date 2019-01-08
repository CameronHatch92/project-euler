import com.sun.source.util.SourcePositions;

public class NumberSpiralDiagonal {
    public static void main(String[] args) {
        System.out.println(diagonalSum());
    }

    public static int[] squareSum(int square, int start){
        int incr = square-1;
        int sum = 4*start + 10*incr;
        int times = (int) square/2;
        int newStart = start + 8*times;
        int[] answer = {sum, newStart};
        return answer;
    }

    public static int diagonalSum(){
        int total = 1;
        int start = 1;
        int i;
        for(i = 3; i<=1001; i += 2){
            int[] squareSumAnswer = squareSum(i, start);
            total += squareSumAnswer[0];
            start = squareSumAnswer[1];
        }
        return total;
    }
}
