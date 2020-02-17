import java.util.*;

class P03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x;
        int sum =0;
        while(x!=0){
            int temp = x%10;
            sum = sum*10+temp;
            x=x/10;
        }
        if(sum==y){
            System.out.println("Reversed num = "+sum);
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    sc.close();
    }
}