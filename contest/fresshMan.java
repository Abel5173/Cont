import java.util.Scanner;

class fresshMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] cridit = { 4, 3, 3, 3, 3, 3 };
        char[] grade= new char[6];
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
          grade[i]  = input.next().charAt(0);
        }
        for (int i = 0; i < cridit.length; i++) {
           
            if (grade[i] == 'A') {
                sum +=(cridit[i])* 4;
            } else if (grade[i] == 'B') {

                sum +=(cridit[i])* 3;
            } else if (grade[i] == 'C') {

                sum +=(cridit[i])* 2;
            } else if (grade[i] == 'D') {
                sum +=(cridit[i])* 1;
            } else {
                sum +=(cridit[i])* 0;
            }

        }
        double result = sum/19;
        System.out.printf("%.2f",result);
    }
}