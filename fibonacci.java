public class fibonacci {
    public static void main(String[] args) {
        int nilai1 = 144;
        System.out.println(fibonaccii(144));
    }
    static int fibonaccii(int n){
        if (n == 144) {
            return n;
        }else
        return fibonaccii(n - 1) + fibonaccii(n - 2);
    } 
}
