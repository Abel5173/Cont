import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class reapeated {
    public static void main(String[] args) {
    
      Scanner input=new Scanner(System.in);
      String a= input.nextLine();
      char[] b=new char[a.length()];
      char[] c=new char[a.length()];
     for (int i = 0; i < a.length(); i++) {
                 b[i]=a.charAt(i);
     }
     for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c.length; j++) {
            if(b[i]==b[j]){
                continue;
            }
            else{
                System.out.println(b);
            }
        }
     }
     }
  
    }

