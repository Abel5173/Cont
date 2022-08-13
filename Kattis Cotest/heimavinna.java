import java.util.Scanner;

public class heimavinna {

    public static void main(String[] args) {
        int j = 0, count = 0;
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            char f = ';';
            char d = '-';

            while (j < str.length()) {
                Character c = str.charAt(j + 1);
                if (c.equals(d)) {
                    int a = Character.getNumericValue(str.charAt(j));
                    int b = Character.getNumericValue(str.charAt(j + 2));
                    count += ((b - a) + 1);
                    j += 3;
                    //continue;
                } else {
                    count++;
                    j += 2;
                    //continue;
                }
            }
            System.out.println(count);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(count);
        }

    }
}
