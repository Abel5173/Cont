import java.util.Scanner;

class BeattheSpread {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Long sum = sc.nextLong(), dif = sc.nextLong();
                if (sum > dif) {
                    Long a = (sum + dif) / 2;
                    long b = sum - a;
                    if (b > a)
                        System.out.println(b + " " + a);
                    else
                        System.out.println(a + " " + b);
                } else {
                    System.out.println("impossible");
                }
            }
        }
    }
}
