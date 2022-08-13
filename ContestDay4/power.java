import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum;

        int t;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int b;
            List<Integer> a = new ArrayList();
            while ((b = sc.nextInt()) != 0) {
                a.add(b);
            }
            Collections.sort(a, Collections.reverseOrder());
            sum = 0;

            for (int j = 1; j <= a.size(); j++) {
                sum += 2 * (Math.pow(a.get(j - 1), j));
            }
            if (sum > 5000000) {
                System.out.println("Too expensive");
            } else {
                System.out.println(sum);
            }

        }

    }
}
