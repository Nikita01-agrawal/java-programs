import java.util.*;

class P32{
    public static void main(String args[]) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        while(x!=0) {
            temp = temp*10+x%10;
            x = x/10;
        }

        // for(int x = num; x!=0; x=x/10) {
        //     temp = temp*10+x%10;
        //}
        
        if(temp == num){
            System.out.println("Palindrome!!!!");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}