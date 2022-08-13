import java.util.Scanner;

class tes1{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        String c="";
        for (int i = 0; i < n; i++) {
            long a=input.nextLong();
            a*=567;
            a/=9;
            a+=7492;
            a*=235;
            a/=47;
            a-=498;
            c=String.valueOf(a);
            System.out.println(c.charAt(c.length()-2));;
        }
    
    }
}