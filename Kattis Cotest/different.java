import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // while((a=sc.hasNext()) != null && (b=sc.nextLong()) != null ){
        //     System.out.println(Math.abs(a-b));
        // }
        try {
            BufferedReader br = new BufferedReader(new FileReader("examplefile.txt"));
        
            // read until end of file
            Long a, b = (long) 0;
            // while ((a = br.readLine()) != null) {
            //     System.out.println(line);
            // }
        
            // close the reader
            br.close();
                
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
