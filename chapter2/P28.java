import java.util.Scanner;

class P28 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if( x%400 ==0 || ((x%100 != 0) && (x%4 == 0))){
            System.out.println(x + "is a leap year");
        }
        else {
            System.out.println(x + "is not a leap year");
        }
    }
}