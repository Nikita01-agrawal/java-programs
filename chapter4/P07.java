import java.util.*;

class P07{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter number to print its table");
            int x = sc.nextInt();
            int i = 1;
            while(i<=10){
                System.out.println(x*i);
                i++;
            }
        }


    }
}