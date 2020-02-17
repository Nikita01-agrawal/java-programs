import java.util.*;

    class P38{
    public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    int h1= sc.nextInt();
    int m1 = sc.nextInt();
    int sec1 = sc.nextInt();

    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int sec2 = sc.nextInt();

    int h3;
    int m3;
    int sec3;
    
        if(sec1 + sec2 > 60){
            sec3 = sec1 + sec2 - 60;
            m3 = m1+m2+1;
            if(m3>60){
                m3 = m3 - 60;
                h3 = h1+h2+1;
            }
            else{
                h3=h1+h2;
            }
        }
        else{
            sec3 = sec1 + sec2;
            m3 = m1+m2;
                if(m3>60){
                    m3 = m3 - 60;
                    h3 = h1+h2+1;
                }
                else{
                    h3=h1+h2;
                }
        }
        System.out.println(h3 + " hours" + m3 + " min" + sec3 + " sec");

    }
}