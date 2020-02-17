import  java.util.*;

class P29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i;
        int hcf=0;
        for(i=1;i<=x && i<=y; i++){
            if(x%i ==0 && y%i ==0){
                hcf = i;
            }
        }
        System.out.println("Factors of "+x +" and " + y +" is "+hcf);


        // for(int i=1;i<=y;i++){
        //    if(y%i ==0){
        //    System.out.println("Factors of "+y+" is "+i);
        //    }
        // }
    
    }
}