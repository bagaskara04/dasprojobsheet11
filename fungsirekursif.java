public class fungsirekursif {
    public static void main(String[] args) {
        System.out.println(kali(1));
    }

    static int kali(int a) {
        if (a == 144) {
            return a;
        }else{
            return (a + kali(a+1));
        }
    }
}
