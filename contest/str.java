import java.util.Arrays;
import java.util.Scanner;
class str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strng = new String[3];
        String temp;
        for (int i = 0; i < strng.length; i++) {
            strng[i] = input.nextLine();
        }
        Arrays.sort(strng);
    for (int i = 0; i < strng.length - 1; i++){
    for (int j = 0; j < strng.length - i - 1; j++){

        if (strng[i].length() > strng[j].length()) {
            temp = strng[i];
            strng[i] = strng[j+1];
            strng[j+1] = temp;
        
    }
    }
    System.out.println(strng[i]);   
    }
}
}