import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class fresshMan {
    public static void main(String[] args) {
        Map<String, Integer> dataty = new HashMap<>();
        Map<String, Integer> indata = new HashMap<>();
        Scanner input = new Scanner(System.in);
      dataty.put("int", 4);
      dataty.put("bool", 1);
      dataty.put("char", 1);
      dataty.put("double", 8);
      dataty.put("float", 4);
      String in=input.nextLine();
      int num=Integer.parseInt(in);
        for (int i = 0; i < num; i++) {
            String a = input.nextLine(),c =input.nextLine();;
            int b = Integer.parseInt(c);
            indata.put(a, b);
                   }
       System.out.println(Math.sin);
       
    }
}