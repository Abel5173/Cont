import java.util.Scanner;

class BabyMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            double s = 0;
            sc.nextLine();
            for (int j = 0; j < 2; j++) {
                String c = sc.nextLine();
                int a = sc.nextInt();

                if (j == 0)
                    s += (a * 0.5);
                else if (j == 1)
                    s += (a * 0.05);
            }
            System.out.println("Case " + (i + 1) + ": " + s);
        }
    }
}
