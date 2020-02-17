import java.util.*;

class P22{
    public static void main(String[] args) {
        int num;
        int large;
        int secondLarge;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        num = scan.nextInt();
        large = num;
        small = num;
        secondLarge = num;
        for (int x = 9; x > 0; x--) {
            System.out.print("Enter " + x + " more number: ");
            num = scan.nextInt();

            if (num >= large) {
                secondLarge = large;
                large = num;
            }
            else if (num>secondLarge) {
                secondLarge = num;
            }

        } 
        System.out.println( large + " is the largest number, " + secondLarge + " is the second largest number");
    }
}