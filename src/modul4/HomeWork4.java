package modul4;

public class HomeWork4 {

    public static void main(String[] args) {
        num(3);
        System.out.println();
        drawRectangle(5, 4);
        System.out.println();
        drawRectangle(3);
        System.out.println();
        getMax(2,4);
        System.out.println(getMax(5, 6));
        System.out.println();
        numRecurtion(7);

    }

    public static void num(int x) {
        int f = 0;
        for (int i = 0; i < x; i++) {
            f++;
            System.out.println(f);
        }
    }

    public static void drawRectangle(int x, int y) {
        char[] arr = new char[x];
        for (int i = 0; i < x; i++) {
            arr[i] = '+';
        }
        for (int i = 0; i < y; i++) {
            System.out.println(arr);
        }

    }

    public static void drawRectangle(int x) {
        char[] arr = new char[x];
        int y = x;
        for (int i = 0; i < x; i++) {
            arr[i] = '+';
        }
        for (int i = 0; i < y; i++) {
            System.out.println(arr);
        }

    }

    public static int getMax(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static float getMax(float a, float b) {
        float max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static double getMax(double a, double b) {
        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    private static void numRecurtion(int x) {
        if (x == 1) {
            System.out.println(x);
            return;
        }
        if (1 < x) {
            System.out.println(x);
            numRecurtion(x-1);
        }
    }
}



