import java.util.Scanner;

 class ifprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a;
       
        while((a=input.nextLong())!=-1){
            boolean n=true;
        for (long i = 2; (i*i)<=a; i++) {
            if (a%i==0) {
              n=false;
              break;
            } 
        }
        if(n){
            System.out.println(a+" is PRIME!!");
        }else{
                       System.out.println(a+" is COMPOSITE TT");
        }
    }
}}
