import java.util.Scanner;

 class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                  long a;
        while((a=input.nextLong())!=-1){
           long b=input.nextLong();
       long c= gcd(a,b);
        System.out.print(c+" ");
        long lcm=(a*b)/c;
        System.out.println(lcm);
        }
    }

    private static long gcd(long a, long b) {
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    
}