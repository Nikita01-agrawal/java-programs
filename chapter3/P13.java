import java.util.*;

class P13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<=20;i++){
            int x = sc.nextInt();
            if(x>100){
                System.out.println(x+"is greater than 100");
            }
            sum = sum+x;
        }
        System.out.println("Sum of all the number ="+sum);
    }
}
