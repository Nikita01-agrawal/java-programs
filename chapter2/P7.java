import java.util.Scanner;
class P7 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.println("Square = " + x*x);
        }
        else {
            System.out.println(Math.sqrt(x));
        }
    }
}
