package modul4;

public class HomeWork4 {

    public static void main (String[] args){
        num(3);
        System.out.println();
        drawRectangle(5, 4);
        System.out.println();
        drawRectangle(3);

    }

    public static void num (int x){
        int f = 0;
            for (int i = 0; i < x; i++) {
                f++;
                System.out.println(f);
            }
        }
    public static void drawRectangle (int x, int y){
        char [] arr = new char [x];
        for (int i = 0; i < x; i++) {
            arr[i] = '+';
        }
        for (int i = 0; i < y; i++) {
            System.out.println(arr);
        }

    }
    public static void drawRectangle (int x){
        char [] arr = new char [x];
        int y = x;
        for (int i = 0; i < x; i++) {
            arr[i] = '+';
        }
        for (int i = 0; i < y; i++) {
            System.out.println(arr);
        }

    }
}
