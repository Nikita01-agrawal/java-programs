import java.util.*;

class P01{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int sum = 0;
    while(x!=0){
        int temp = x%10;
        sum = sum+temp;
        x=x/10;
    }
    System.out.println(sum);
    sc.close();
    }
}