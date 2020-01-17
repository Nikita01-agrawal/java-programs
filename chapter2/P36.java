import java.util.*;

    class P36{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int cm1 = sc.nextInt();
        int m2 = sc.nextInt();
        int cm2 = sc.nextInt();
        
        int m3, cm3;

        if(cm1+cm2<100) {
            cm3 = cm1+cm2;
            m3 = m1+m2;
        }
        else {
            cm3 = (cm1+cm2)-100;
            m3 = m1+m2+1;
        }
        System.out.println(m3 + "m " + cm3+ "cm");
    }
}