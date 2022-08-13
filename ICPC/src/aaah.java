import java.util.Scanner;
public class aaah {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in) ;
        String Jon = scan.nextLine();
        String Doctor = scan.nextLine();
        if(Jon.length() < Doctor.length()){
            System.out.println("no");
        } else
        System.out.println("go");
    }
}
