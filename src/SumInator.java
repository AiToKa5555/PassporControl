import java.util.Scanner;

public class SumInator {
    public static int sumInator(int a){
        Scanner sc = new Scanner(System.in);
        int[] n = new int[a];
        int res = 0;
        System.out.println("введите число x");
        int x = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
            System.out.println("введите число");
            n[i] = sc.nextInt();
        }
        int count = n.length - 1;
        System.out.println(".");
        for (int j = 0; j < n.length; j++) {
            res += Math.pow(x, count) * n[j];
            count--;
        }

        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите длину сложения многочленов");
        int a = sc.nextInt();
        System.out.println(sumInator(a));
    }
}
