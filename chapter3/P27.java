import  java.util.*;

class P27{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=2;i<x;i++){
            if(x%i == 0){
                break;
            }
        }
        
        if(i==x){
            System.out.println(" prime");
        } else {            
            System.out.println("not prime");
        }
    }
}