import java.util.*;

class P26{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for(int i=1;i<=x;i++){
            if(x%i ==0){
                System.out.println(i);
                sum = sum+i;
            }
        }
        System.out.println("Sum of the factors of "+x+" is "+sum);
    }
}