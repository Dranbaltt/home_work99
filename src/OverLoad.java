public class OverLoad {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b / c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b / (c + d);
    }

    public static int sum(int a, int b, int c, int d, int i) {
        return a + b / c + d * i;
    }

    public static void main(String[] args) {
        System.out.println(sum(11, 16));
        System.out.println(sum(10, 5, 12));
        System.out.println(sum(8, 99, 5, 16));
        System.out.println(sum(6, 6, 6, 6, 6));

    }
}
