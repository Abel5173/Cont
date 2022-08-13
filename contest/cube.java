import java.util.Scanner;

class cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int n=input.nextShort();
        long sum=0;
        for (long i = 1; i <=n; i++) {
            sum+=(i*i*i);
        }
        System.out.println(sum);
    }
}
