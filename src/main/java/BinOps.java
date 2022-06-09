public class BinOps {
    public String sum(String a, String b) {
        int newA = Integer.parseInt(a, 2);
        int newB = Integer.parseInt(b, 2);
        int sumResult = newA + newB;
        String result1 = Integer.toBinaryString(sumResult);
        return result1;
    }

    public String mult(String a, String b) {
        int newA = Integer.parseInt(a, 2);
        int newB = Integer.parseInt(b, 2);
        int sumResult = newA * newB;
        String result2 = Integer.toBinaryString(sumResult);
        return result2;
    }
}