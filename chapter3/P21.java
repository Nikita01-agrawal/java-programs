import java.util.*;

class P21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Arrays.sort(x);
        // System.out.println(x[len-1]);
        // System.out.println(x[0]);

        int max = x;
        for(int i=0;i<9;i++){
            x = sc.nextInt();
            if(x>max){
                max=x;
            }
        }
        System.out.println("Maximum number is "+ max);

        // int secondMax = x[1];
        // for(i =1;i<len;i++){
        //     if(x[i]>secondMax){
        //         secondMax = x[i];
        //     }
        // }
        // System.out.print("Second largest number is "+secondMax);

        // int min = x[0];
        // for(i=0;i<len;i++){
        //     if(x[i]<min){
        //         min=x[i];
        //     }
        // }
        // System.out.println("Minimum number is "+min);
    }
}