public class IntegerRightTriangles {
    public static void main(String[] args) {
        // start at 12 because the smalles Pythagorean triple is (3, 4, 5)
        int p = 12;
        int triples = 1;
        for(int perimeter=12; perimeter<=1000; perimeter++){
            int count = 0;
            for(int c=5; c<=perimeter-7; c++){
                for(int b=4; b<c; b++){
                    int a = perimeter-c-b;
                    if(isRight(c, b, a)){
                        count++;
                    }
                }
            }
            if(count>triples){
                triples = count;
                p = perimeter;
            }
        }
        System.out.println(p + "number of triples is: " + triples);

    }

    public static boolean isRight(int c, int b, int a){
        if(Math.pow(c, 2) == Math.pow(b,2) + Math.pow(a, 2)){
            return true;
        }
        return false;
    }
}
