import java.util.Scanner;

public class P99problems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        if(N.toString().length() > 2){
            int l = (N - (N % 100))  - 1;
            int r = (N - (N % 100))  + 99;
            if(N - l < r - N ){
                System.out.println(l);
            } else{
                System.out.println(r);
            }
        }  else{
            System.out.println(0 + 99);
        } 
    }
}
