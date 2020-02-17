class P30{
    public static void main(String args[]){
        int a,b,c,d,n;
        for(int e = 2000;e<9999;e++){
            n=e;
            a=(n%10);
            n = n/10;
            b=(n%10);
            n=n/10;
            c=(n%10);
            n=n/10;
            d=(n%10);
            
            if(a%2!=0&&b%2!=0&&c%2==0&&d%2==0){
                System.out.println(e);
            }
        }
    }
}