import java.util.*;
class P18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = x;
        int min =x;
        for(int i=0;i<4;i++){
            x = sc.nextInt();
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        System.out.println("Biggest number is "+max);
        System.out.println("Smallest number is "+min);

        if(max%2 != 0 && min%2 != 0){
            System.out.println("What a coincidence");
        }
        // Arrays.sort(x);
        // System.out.println(x[4]);
    }
}