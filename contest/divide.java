import java.util.Scanner;

 class divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a;
        while ((a=sc.nextDouble())!=-1) {
            double b=sc.nextDouble();
            int c=sc.nextInt();
            double d=a/b;
            String dd=String.valueOf(d);
           for (int i = 0; i <= c+1; i++) {
            System.out.print(dd.charAt(i));
           }
           System.out.println();
        }
    }
}
