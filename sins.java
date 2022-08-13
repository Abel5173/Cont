import java.util.Scanner;

 class sins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        while((a=input.nextInt())!=-1){
            int t=input.nextInt();
            double x=Math.cos( Math.toRadians(a))*t;
          
            double y=Math.sin( Math.toRadians(a))*t;
            System.out.printf("%.5f",x);
            System.out.printf(" %.5f%n",y);
        }
    }
}
