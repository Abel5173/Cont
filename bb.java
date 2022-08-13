import java.util.Scanner;

public class bb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 1;
        boolean b = true;
        int cnt = 1;
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    cnt++;
                    b = false;
                } else {
                    b = true;
                }
                if (b) {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(max);
        }
        sc.close();
    }
}