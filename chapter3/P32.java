class P32{

    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<20;i++){
            int fib= a+b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
    }
}