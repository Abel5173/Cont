import java.util.Scanner;

class BobandWalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int cnt = 0, temp = 0;
            for (int j = 0; j < a; j++) {
                int b = sc.nextInt();
                if (temp < b) {
                    cnt++;
                    temp = b;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
