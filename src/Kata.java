import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;
//TODO чел, который работает за этим компом,не пиши в моём проекте

public class Kata {
    public static String explode(String digits) {
        StringBuilder result = new StringBuilder();
        String [] text = digits.split("");
        for (String s : text) {
            result.append(s.repeat(Integer.parseInt(s)));
        }
        result.toString().repeat(4);
        return result.toString();
    }
    public static boolean isPlural(float f){
        return f != 1;
    }
    public static int unluckyDays(int year) {
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            LocalDate unlucky = LocalDate.of(year, i,13);
            DayOfWeek dayOfWeek = unlucky.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.FRIDAY)){
                count++;
            }
        }

        return count;
    }
    public static String pattern(int n){
        StringBuilder result = new StringBuilder();
        result.append("1\n");
        for (int i = 2; i <= n; i++) {
            result.append("1");
            result.append("*".repeat(i - 1));
            result.append(i).append("\n");
        }

        return result.toString();
    }
    public static int sumOfAngles(int n) {
        return 180 * (n - 2);
    }
    public static long fib (int n) {
        long first = 0;
        long next = 1;
        long res = 0;
        for (int i = 1; i < n; i++) {
            res = first + next;
            first = next;
            next = res;
        }

        return res;

    }
    public static String stringMerge(String s1, String s2, char letter) {
        String result = "";
        int n1 = s1.indexOf(letter);
        int n2 = s2.indexOf(letter);
        result += s1.substring(0, n1);
        result += s2.substring(n2);

        return result;
    }
    public static String maskify(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() <= 4){
            return str;
        } else {
            int n = str.length();
            for (int i = 0; i < n - 4; i++) {
                result.append("#");
            }
            for (int i = n - 4; i < n; i++) {
                result.append(str.charAt(i));
            }
            return result.toString();

        }
        // throw new UnsupportedOperationException("Unimplemented");

    }
    public static boolean isDivisible(int ... data) {
        boolean result = false;
        int n = data[0];
        int count = 0;
        for (int i = 1; i < data.length; i++) {
            if (n % data[i] == 0){
                count++;
            }
        }
        return count == data.length - 1;
    }
    public static boolean isDivisible(long n, long x, long y) {
        boolean result = n % x == 0 && n % y == 0;
        return result;
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    count++;
                } else {
                    sum += input[i];
                }
            }
        }
        return new int[]{count, sum};
    }
    public static String numberToString(int num) {
        return Integer.toString(num);
    }
    public static boolean isEven(double n) {
        return n % 2 == 0;
    }


    public static void main(String[] args) {
    }
}
