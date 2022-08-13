import java.util.Scanner;

 class tes2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
      int count;
       int a,b;
        for (int i = 0; i < n; i++) {
             count=0;
             a=0;
            int ino=input.nextInt();
            for (int j = 0; j < ino; j++) {
                b=input.nextInt();
                if(b>a){
                    count++;
                    a=b;
                }
            }
            System.out.println(count);
    }
}
}
