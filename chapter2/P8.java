import java.util.Scanner;

class P8 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z){
            if(y>z){
            System.out.println(x + " " + y + " " + z);
            }
            else{
                System.out.println(x + " " + z+ " " + y);    
            }
        }
        else if(y>x && y>z){
            if(x>z){
            System.out.println(y + " " + x + " " + z);
            }
            else{
            System.out.println(y + " " + z+ " " + x);
            }
        }
        else {
            if(x>y){
            System.out.println(z + " " + x + " " + y);
        }
        else
            System.out.println(z + " " + y + " " + x);
        }
    }

    
}