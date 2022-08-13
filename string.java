import java.util.Scanner;

class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if(Character.isUpperCase(b)){
                System.out.print(Character.toLowerCase(b));
            }
        }
    }
}
