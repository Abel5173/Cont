import java.util.Scanner;

 class speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt(), b=input.nextInt();
        double result =(2*(a*b))/(a+b);
        System.out.printf("%.5f",result);
    }
}
