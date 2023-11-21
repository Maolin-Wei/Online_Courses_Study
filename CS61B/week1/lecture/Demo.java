public class Demo {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(larger(x, y));
    }
}