import java.util.*;

class P24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factor");
        int x = sc.nextInt();
        int count = 0;
        for(int i=1;i<=x;i++){
            if(x%i ==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("count"+count);
    }
}