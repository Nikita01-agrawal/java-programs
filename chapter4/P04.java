import java.util.*;

class P04{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int sumOfEven=0;
        int sumOfOdd=0;
        while(temp!=0){
            int temp1 = temp%10;
            if(temp1%2==0){
                sumOfEven = sumOfEven+temp1;
            }
            else{
                sumOfOdd = sumOfOdd+temp1;
            }
            temp = temp/10;
        }
        System.out.println("Sum of even numbers "+sumOfEven);
        System.out.println("Sum of odd numbers"+sumOfOdd);
        sc.close();
    }
}