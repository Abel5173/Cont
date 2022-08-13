import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        try {
            for (int j = 0; j < a.length; j++) {
                while (a[j] > a[j + 1]) {
                    a[j + 1] += 1;
                    cnt += 1;
                }
            }
        } catch (Exception e) {
            System.out.println(cnt);
        }
    }
}
